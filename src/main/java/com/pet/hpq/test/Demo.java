package com.pet.hpq.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Demo {

    @Test
    public void demo01(){
        BigDecimal num = new BigDecimal(42);
        BigDecimal totalPrice = new BigDecimal(0);
        totalPrice=num.multiply(totalPrice);
        System.out.println(totalPrice);
//        Random random = new Random();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMwwDDkkmmSSSS");
//        Date date =new Date();
//        String format = dateFormat.format(date);
//        format += (random.nextInt(999)+1);
//        System.out.println(format);
    }
}
