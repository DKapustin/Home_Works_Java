package com.company;

public class Main {

    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("PC", 50000, 5);
        Item y = new Item("PC", 50000);
        DiscountedItem z = new DiscountedItem("PC", 50000, 10);
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
    }
}