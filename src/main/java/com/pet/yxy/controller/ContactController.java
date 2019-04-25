package com.pet.yxy.controller;

import com.pet.yxy.pojo.Contact;
import com.pet.yxy.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    /**
     * 添加留言
     * @param contact
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "addContact",method = RequestMethod.POST)
    public int addContact(@RequestBody Contact contact) {
        return contactService.insertSelective(contact);
    }
}
