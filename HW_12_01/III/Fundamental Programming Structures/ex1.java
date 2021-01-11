package com.company;
import java.util.Scanner;

public class Main {

    public static String binary(int number){
        String s = "";
        while (number>0){
          int n = number%2;
          s = n+s;
          number=number/2;
        }
        return s;
    }
    public static String octal(int number){
        String s = "";
        while (number>0){
            int n = number%8;
            s = n+s;
            number=number/8;
        }
        return s;
    }
    public static String hexadecimal(int number){
        String s = "";
        while (number>0){
            int n = number%16;
            switch (n){
                case(10):
                    s = 'A'+s;
                    break;
                case(11):
                    s = 'B'+s;
                    break;
                case(12):
                    s = 'C'+s;
                    break;
                case(13):
                    s = 'D'+s;
                    break;
                case(14):
                    s = 'E'+s;
                    break;
                case(15):
                    s = 'F'+s;
                    break;
                default:
                    s = n+s;
                    break;
            }
            number=number/16;
        }
        return s;
    }
    public static String antiHexadecimal(int number){
        String s = "";
        float antiNumber = 1.0f/number;
        float current = antiNumber*16;
        while (current>0){
            int whole = (int)(current);
            s = s+hexadecimal(whole);
            current = (current - whole)*16;
        }
        return "0,"+s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        System.out.println("2: "+binary(number));
        System.out.println("8: "+octal(number));
        System.out.println("16: "+hexadecimal(number));
        System.out.println("Number^-1 16: "+antiHexadecimal(number));


    }
}