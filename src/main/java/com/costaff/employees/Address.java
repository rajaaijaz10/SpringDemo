package com.costaff.employees;

public class Address {
    private int aid;
    private String area;
    private int pincode;

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", area='" + area + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(int aid, String area, int pincode) {
        this.aid = aid;
        this.area = area;
        this.pincode = pincode;
    }
}
