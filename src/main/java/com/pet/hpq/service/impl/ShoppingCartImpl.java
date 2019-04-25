package com.pet.hpq.service.impl;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.mapper.ShoppingCartMapper;
import com.pet.hpq.mapper.TOrderMapper;
import com.pet.hpq.service.ShoppingCart;
import com.pet.hpq.vo.AddOrderGoodsVo;
import com.pet.hpq.vo.AddOrderVo;
import com.pet.hpq.vo.ShoppingCarVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ShoppingCartImpl implements ShoppingCart {

    @Autowired(required = false)
    ShoppingCartMapper shoppingCartMapper;
    @Autowired(required = false)
    TOrderMapper tOrderMapper;

    public List<ShoppingCarDto> getCart(int customerId) {
        return shoppingCartMapper.getCart(customerId);
    }

    public int removeCart(ShoppingCarVo shoppingCarVo) {
        return shoppingCartMapper.removeCart(shoppingCarVo);
    }

    @Transactional
    public int addOrder (ShoppingCarVo shoppingCarVo) {
        String[] cartMessage = shoppingCarVo.getCartMessage();
        if (cartMessage!=null){
            ArrayList<ShoppingCarDto> shoppingCarDtos = new ArrayList<ShoppingCarDto>();
            BigDecimal allPrice=new BigDecimal(0);
            for (String s:cartMessage){
                int cartId = Integer.parseInt(s.split("&")[0].split("cartId=")[1]);
                int goodsId = Integer.parseInt(s.split("&")[1].split("goodsId=")[1]);
                int parameterId = Integer.parseInt(s.split("&")[2].split("parameterId=")[1]);
                int number = Integer.parseInt(s.split("&")[3].split("number=")[1]);
                ShoppingCarDto shoppingCarDto = new ShoppingCarDto();
                shoppingCarDto.setCartId(cartId);
                shoppingCarDto.setGoodsId(goodsId);
                shoppingCarDto.setParameterId(parameterId);
                shoppingCarDto.setNumber(number);
                BigDecimal num = new BigDecimal(number);
                BigDecimal totalPrice ;
                BigDecimal price = shoppingCartMapper.getPrice(parameterId);
                totalPrice=price.multiply(num);
                allPrice= allPrice.add(totalPrice);
                shoppingCarDto.setPrice(price);
                shoppingCarDto.setTotalPrice(totalPrice);
                shoppingCarDtos.add(shoppingCarDto);
            }
            shoppingCartMapper.removeAllCart(shoppingCarVo.getCustomerId());
            int addressId = shoppingCartMapper.getAddressId(shoppingCarVo.getCustomerId());
            AddOrderVo addOrderVo = new AddOrderVo();
            addOrderVo.setCustomerId(shoppingCarVo.getCustomerId());
            addOrderVo.setAddressId(addressId);
            addOrderVo.setTotalPrice(allPrice);
            Random random = new Random();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMwwDDkkmmSSSS");
            Date date =new Date();
            String format = dateFormat.format(date);
            format += (random.nextInt(999)+1);
            addOrderVo.setOrderNumber(format);
            shoppingCartMapper.addOrder(addOrderVo);
            int orderId = addOrderVo.getOrderId();
            AddOrderGoodsVo addOrderGoodsVo = new AddOrderGoodsVo();
            addOrderGoodsVo.setOrderId(orderId);
            addOrderGoodsVo.setShoppingCarDtos(shoppingCarDtos);
            int i = shoppingCartMapper.addOrderGoods(addOrderGoodsVo);
            return i;
        }
        return 0;
    }


}
