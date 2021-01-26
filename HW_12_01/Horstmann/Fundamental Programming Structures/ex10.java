package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String base36(int number){
        String s="";
        while(number > 0){
            int n = number%36;
            if ((n>=0) && (n<=9)){
                s = n +s;
            }
            else{
                s = (char)(n+87)+s;
            }
            number = number/36;
        }
        return s;
    }
    public static int to10fromBase36(String str){
        int res = 0;
        char [] array = str.toCharArray();
        for (int i = 0;i<str.length();i++){
            if (((int)array[i]>=97) && ((int)array[i]<=122)){
                res = res+((int)array[i]-87)*(int)Math.pow(36,str.length()-i-1);
            }
            else{
                res = res + Character.digit(array[i],10)*(int)Math.pow(36,str.length()-i-1);
            }
        }
        return res;
    }
    public static String randomString(){
        Random random = new Random();
        int len = random.nextInt(20)+1;
        StringBuilder s = new StringBuilder();
        for (int i=0;i<len;i++){
            int r = random.nextInt(2);
            if (r==1)
                s.append(random.nextInt(10));
            else{
                s.append((char)(random.nextInt(26)+97));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        System.out.println("36: "+base36(number));
        String rStr = randomString();
        System.out.println("Random String: "+rStr);
        System.out.println("Random String 36: "+to10fromBase36(rStr));
    }
}