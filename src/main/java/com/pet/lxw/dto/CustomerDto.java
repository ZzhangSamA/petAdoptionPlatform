package com.pet.lxw.dto;

public class CustomerDto {
    private Integer id;
    private String customerName;

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
