package com.xms.dom4j;

import java.util.Arrays;

/**
 * @author czw
 * @create 2021-07-23-上午 11:49
 */
public class Book {
   private String sn;
   private String name;
   private double price;
   private String[] author;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author=" + Arrays.toString(author) +
                '}';
    }

    public Book(String sn, String name, double price, String[] author) {
        this.sn = sn;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }
}
