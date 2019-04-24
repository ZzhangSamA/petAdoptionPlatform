package com.pet.yxy.service.Impl;

import com.pet.yxy.mapper.ContactMapper;
import com.pet.yxy.pojo.Contact;
import com.pet.yxy.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactMapper contactMapper;


    public int insertSelective(Contact record) {
        return contactMapper.insertSelective(record);
    }
}
