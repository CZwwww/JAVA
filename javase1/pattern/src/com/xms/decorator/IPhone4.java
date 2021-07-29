package com.xms.decorator;

/**
 * @author czw
 * @create 2021-06-23-下午 2:31
 */
public class IPhone4 extends PhoneDecorate {

    public IPhone4(Phone phone) {
        super(phone);
    }

    @Override
    public void function() {
        System.out.println("play game");
        super.function();
    }
}
