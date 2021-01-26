package com.company;

public class Main {

    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(10, "World");
        Greeter greeter2 = new Greeter(10, "Java");
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);
        thread1.start();
        thread2.start();
    }
}