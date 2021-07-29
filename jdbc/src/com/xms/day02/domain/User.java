package com.xms.day02.domain;

public class User{
    private int id;
    private String name;
    private String password;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}