package com.xms.factory.fm;

/**
 * @author czw
 * @create 2021-06-23-上午 10:42
 */
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
