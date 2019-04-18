package com.pet.yz.controller;

import com.pet.yz.service.PayPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PayPlatformController {

    @Autowired
    PayPlatformService payPlatformService;

}
