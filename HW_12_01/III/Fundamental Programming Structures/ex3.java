package com.company;
import java.util.Scanner;

public class Main {

    public static int maxWithOperators(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                return n1;
            } else {
                return n3;
            }
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }
    public static int maxWithMathMax(int n1, int n2, int n3){
        return Math.max(Math.max(n1,n2),Math.max(n1,n3));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number1 = ");
        String str = in.nextLine();
        int number1 = Integer.parseInt(str);
        System.out.print("Number2 = ");
        str = in.nextLine();
        int number2 = Integer.parseInt(str);
        System.out.print("Number3 = ");
        str = in.nextLine();
        int number3 = Integer.parseInt(str);
        System.out.println("Max with operators = "+maxWithOperators(number1,number2,number3));
        System.out.println("Max with Math.max = "+maxWithMathMax(number1,number2,number3));

    }
}