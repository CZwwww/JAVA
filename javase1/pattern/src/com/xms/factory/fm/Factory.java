package com.xms.factory.fm;

/**
 * @author czw
 * @create 2021-06-23-上午 10:33
 */
public  class Factory {
    public static AnimalFactory getInstance(String name){
        if("dog".equals(name)){
            return new CatFactory();
        }
        if("cat".equalsIgnoreCase(name)){
            return new DogFactory();
        }
        return null;

    }
}
