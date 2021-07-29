package com.xms.factory.fm;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-23-上午 10:35
 */
public class AnimalTest {
    @Test
    public void test(){
        Dog dog = (Dog) Factory.getInstance("dog").createAnimal();
        Cat cat = (Cat) Factory.getInstance("cat").createAnimal();

    }
}
