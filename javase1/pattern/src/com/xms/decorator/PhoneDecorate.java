package com.xms.decorator;

/**
 * @author czw
 * @create 2021-06-23-下午 2:24
 */
public class PhoneDecorate implements Phone{
    Phone phone;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }


    @Override
    public void function() {
        phone.function();
    }
}
