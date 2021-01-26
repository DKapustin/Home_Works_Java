package com.company;
import java.util.Scanner;

public class Main {
    public static int summa(String[]str){
        int sum = 0;
        for (int i=0;i<str.length;i++){
            sum+=Integer.parseInt(str[i]);
        }
        return sum;
    }
    public static boolean check(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] strArray =  str.split(" ");
        int len = strArray.length;
        String [][] arrArr = new String[len][len];
        arrArr[0] = strArray;
        int i=1;
        while (true){
            str = in.nextLine();
            if (str.equals("")){
                if (i<len){
                    return false;
                }
                break;
            }
            if (i>=len){
                continue;//Elements more for square. But we need "Blank line"
            }
            arrArr[i] = str.split(" ");
            if (arrArr[i].length!=len){
                return false;
            }
            i++;
        }
        int sum = summa(strArray);
        for (int j=1;j<len;j++){
            if(summa(arrArr[j])!=sum){
             return false;
            }
        }
        for (int j=0;j<len;j++){
            int sumCol =0;
            for (int r=0;r<len;r++){
                sumCol+=Integer.parseInt(arrArr[r][j]);
            }
            if (sumCol!=sum){
                return false;
            }
        }
        int sumDiag = 0;
        for (int j=0;j<len;j++){
            sumDiag+=Integer.parseInt(arrArr[j][j]);
        }
        if (sumDiag!=sum){
            return false;
        }
        sumDiag = 0;
        for (int j=0;j<len;j++){
            sumDiag+=Integer.parseInt(arrArr[j][len - j-1]);
        }
        if (sumDiag!=sum){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (check()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}