package com.pet.yz.vo;

public class ExpressVo {
    private String expCode;
    private String expNo;

    public String getExpCode() {
        return expCode;
    }

    public void setExpCode(String expCode) {
        this.expCode = expCode;
    }

    public String getExpNo() {
        return expNo;
    }

    public void setExpNo(String expNo) {
        this.expNo = expNo;
    }

    @Override
    public String toString() {
        return "ExpressVo{" +
                "expCode='" + expCode + '\'' +
                ", expNo='" + expNo + '\'' +
                '}';
    }
}
