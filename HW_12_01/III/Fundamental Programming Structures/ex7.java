package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a = Integer.parseUnsignedInt(str);
        str = in.nextLine();
        int b = Integer.parseUnsignedInt(str);
        int sum = Math.abs(a) + Math.abs(b);
        int difference = Math.abs(a) - Math.abs(b);
        int product = Math.abs(a) * Math.abs(b);
        int quotient = Math.abs(a) / Math.abs(b);
        int remainder = Math.abs(a) % Math.abs(b);
        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Product:" + product);
        System.out.println("Quotient:" + quotient);
        System.out.println("Remainder:" + remainder);
    }
}