package com.pet.hpq.vo;

import com.pet.tools.SplitPage;
import com.pet.yh.pojo.Customer;

public class OrderInfoVo {
    private SplitPage splitPage;
    private Customer customer;

    public SplitPage getSplitPage() {
        return splitPage;
    }

    public void setSplitPage(SplitPage splitPage) {
        this.splitPage = splitPage;
        splitPage.setPageSize(5);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
