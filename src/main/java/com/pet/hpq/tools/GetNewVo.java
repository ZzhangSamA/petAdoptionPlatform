package com.pet.hpq.tools;

import com.pet.hpq.vo.ShoppingCarVo;

import java.util.ArrayList;
import java.util.List;

public class GetNewVo {

    public static List<ShoppingCarVo> getNewShoppingCarVo(ShoppingCarVo shoppingCarVo){
        ArrayList<ShoppingCarVo> shoppingCarVos = new ArrayList<ShoppingCarVo>();
        String[] cartMessage = shoppingCarVo.getCartMessage();
        if (cartMessage!=null){
            for (String s:cartMessage){
                int cartId = Integer.parseInt(s.split("&")[0].split("cartId=")[1]);
                int goodsId = Integer.parseInt(s.split("&")[1].split("goodsId=")[1]);
                int parameterId = Integer.parseInt(s.split("&")[2].split("parameterId=")[1]);
                int number = Integer.parseInt(s.split("&")[3].split("number=")[1]);
                ShoppingCarVo shoppingCarVoInfo = new ShoppingCarVo();
                shoppingCarVoInfo.setCartId(cartId);
                shoppingCarVoInfo.setGoodsId(goodsId);
                shoppingCarVoInfo.setParameterId(parameterId);
                shoppingCarVoInfo.setNumber(number);
            }
            shoppingCarVos.add(shoppingCarVo);
        }
        return shoppingCarVos;
    }

}
