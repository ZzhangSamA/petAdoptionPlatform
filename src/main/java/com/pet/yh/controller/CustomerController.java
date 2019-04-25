package com.pet.yh.controller;

import com.pet.tools.MailSender;
import com.pet.tools.Md5Utils;
import com.pet.yh.pojo.Customer;
import com.pet.yh.service.CustomerService;
import com.pet.yh.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    /**
     * 登录校验,加盐加密
     * @param customer
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public Object loginCheck(@RequestBody CustomerVo customer, HttpSession httpSession){

        customer.setPassword(Md5Utils.encodePassword(customer.getPassword()));
//        System.out.println("customerName="+customer.getCustomerName()+",password="+customer.getPassword());
        //登录成功以后将用户名和密码保存到session中
        Customer customer1 = customerService.loginCheck(customer);
        if (customer1!=null){
            httpSession.setAttribute("customer",customer1);
            return "true";
        }
        return "false";

    }

    /**
     * 注册
     * @param customer
     * @return
     */
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public Object register(@RequestBody Customer customer){
//        System.out.println(customer);
        customer.setPassword(Md5Utils.encodePassword(customer.getPassword()));
        boolean register = this.customerService.register(customer);
        return register;
    }

    /**
     * 邮箱验证
     * @param eml
     * @return
     * @throws MessagingException
     */
    @RequestMapping(value = "emailCheck")
    public String emailCheck( String[] eml) throws MessagingException {
        MailSender.main(eml);
//        System.out.println(MailSender.checknum);
        return MailSender.checknum;
    }

    /**
     * 注册用户判断用户名或邮箱是否存在
     * @return
     */
    @RequestMapping(value = "registerCustomerCheck")
    public Object registerCustomerCheck(@RequestBody(required = false)CustomerVo customerVo){
        Integer count = customerService.registerCustomerCheck(customerVo);
        return count;
    }

    /**
     * 忘记密码
     * @return
     */
    @RequestMapping(value = "ForgotPassword")
    public Object ForgotPassword(@RequestBody(required = false)CustomerVo customerVo){
        Boolean flag=true;
        customerVo.setPassword(Md5Utils.encodePassword(customerVo.getPassword()));
        Integer count = customerService.ForgotPassword(customerVo);
        return flag.toString();
    }

    /**
     * 信息回显
     * @param
     * @return
     */
    @RequestMapping(value = "getCustomerInfo")
    public Object getCustomerInfo(HttpSession httpSession){
        Customer customer =(Customer) httpSession.getAttribute("customer");
//        System.out.println(customer);
        return customer;
    }

    /**
     * 修改
     * @param
     * @return
     */
    @RequestMapping(value = "updateCustomer1",method = RequestMethod.POST)
    public Object updateCustomer(@RequestBody(required = false) Customer customer){
        //获取customerId

        //获取需要修改的customer对象

        //如果对象没有id属性,将id属性set进去
        System.out.println(1);
        //将set之后的customer对象传入service层进行数据库操作
//        Customer customer1 =(Customer) httpSession.getAttribute("customer");
//        System.out.println(customer1.getCustomerId());
//        System.out.println(customer);
//        if(customer1.getCustomerId()==0){
//            return false+"";
//        }
        customer.setCustomerId(customer.getCustomerId());
        boolean flag = this.customerService.updateCustomer(customer);
        return flag;
    }
}
