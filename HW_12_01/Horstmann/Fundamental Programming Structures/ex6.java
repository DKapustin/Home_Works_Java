package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger factorial(Integer number){
        BigInteger result = BigInteger.valueOf(1);
        for (int i=1;i<number;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
    return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        Integer number = in.nextInt();
        System.out.println(number+"! = "+factorial(number));
    }
}