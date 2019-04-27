package com.pet.hpq.service.impl;

import com.pet.hpq.dto.ShoppingCarDto;
import com.pet.hpq.mapper.ShoppingCartMapper;
import com.pet.hpq.mapper.TOrderMapper;
import com.pet.hpq.service.ShoppingCart;
import com.pet.hpq.tools.GetNewVo;
import com.pet.hpq.vo.AddOrderGoodsVo;
import com.pet.hpq.vo.AddOrderVo;
import com.pet.hpq.vo.ShoppingCarVo;
import com.pet.tools.RandomNumber;
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
        if (shoppingCarVo.getStatus()==1){
            int addressId=shoppingCarVo.getAddressId();
            if (addressId==0){
               addressId  = shoppingCartMapper.getAddressId(shoppingCarVo.getCustomerId());

            }
            List<ShoppingCarDto> cart = shoppingCartMapper.getCart(shoppingCarVo.getCustomerId());
            if (cart!=null){
                BigDecimal orderTotalPrice=new BigDecimal(0);
                for (ShoppingCarDto sc:cart){
                    BigDecimal goodsTotalPrice = sc.getTotalPrice();
                   orderTotalPrice= orderTotalPrice.add(goodsTotalPrice);
                }
                AddOrderVo addOrderVo = new AddOrderVo();
                addOrderVo.setOrderNumber(RandomNumber.getFormat());
                addOrderVo.setTotalPrice(orderTotalPrice);
                if (addressId==0){
                    return 0;
                }
                addOrderVo.setAddressId(addressId);
                addOrderVo.setCustomerId(shoppingCarVo.getCustomerId());
                shoppingCartMapper.addOrder(addOrderVo);
                shoppingCartMapper.removeAllCart(shoppingCarVo.getCustomerId());
                AddOrderGoodsVo addOrderGoodsVo = new AddOrderGoodsVo();
                addOrderGoodsVo.setOrderId(addOrderVo.getOrderId());
                addOrderGoodsVo.setShoppingCarDtos(cart);
                return shoppingCartMapper.addOrderGoods(addOrderGoodsVo);
            }

        }
        else if(shoppingCarVo.getStatus()==2){
            BigDecimal totalPrice ;
            BigDecimal num = new BigDecimal(shoppingCarVo.getNumber());
            BigDecimal price = shoppingCartMapper.getPrice(shoppingCarVo.getParameterId());
            if (price==null){
                return 0;
            }
            totalPrice=num.multiply(price);
            int addressId=shoppingCarVo.getAddressId();
            if (addressId==0){
                addressId= shoppingCartMapper.getAddressId(shoppingCarVo.getCustomerId());

            }
            if (addressId==0){
                return 0;
            }
                AddOrderVo addOrderVo = new AddOrderVo();
                addOrderVo.setCustomerId(shoppingCarVo.getCustomerId());
                addOrderVo.setAddressId(addressId);
            System.out.println(shoppingCarVo.getAddressId());
                addOrderVo.setTotalPrice(totalPrice);
                String format = RandomNumber.getFormat();
                addOrderVo.setOrderNumber(format);
                shoppingCartMapper.addOrder(addOrderVo);
                shoppingCarVo.setPrice(price);
                shoppingCarVo.setTotalPrice(totalPrice);
                shoppingCarVo.setOrderId(addOrderVo.getOrderId());
                return shoppingCartMapper.addOneOrderGoods(shoppingCarVo);



        }
        return 0;
    }

    public int addShoppingCart(ShoppingCarVo shoppingCarVo) {
        BigDecimal totalPrice ;
        BigDecimal num = new BigDecimal(shoppingCarVo.getNumber());
        BigDecimal price = shoppingCartMapper.getPrice(shoppingCarVo.getParameterId());
        totalPrice=num.multiply(price);
        shoppingCarVo.setPrice(price);
        shoppingCarVo.setTotalPrice(totalPrice);
        return shoppingCartMapper.addShoppingCart(shoppingCarVo);
    }
    public int getCartCount(Integer customerId) {
        return shoppingCartMapper.getCartCount(customerId);
    }

    @Transactional
    public int changeNum(ShoppingCarVo shoppingCarVo) {
       BigDecimal price= shoppingCartMapper.getPriceInfo(shoppingCarVo);
        System.out.println(price);
       if (price!=null){
           System.out.println(11);
           int number = shoppingCarVo.getNumber();
           BigDecimal num = new BigDecimal(number);
           BigDecimal totalPrice = num.multiply(price);
           shoppingCarVo.setPrice(price);
           shoppingCarVo.setTotalPrice(totalPrice);
           return  shoppingCartMapper.updateShoppingCar(shoppingCarVo);

       }
        return 0;
    }

    public ShoppingCarDto getOneGoods(ShoppingCarVo shoppingCarVo) {
        return shoppingCartMapper.getOneGoods(shoppingCarVo);
    }


}
