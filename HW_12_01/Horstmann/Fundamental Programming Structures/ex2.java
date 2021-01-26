package com.company;
import java.util.Scanner;

public class Main {
public static int convertToDegree(int number){
    if (number>=0){
        return number%360;
    }
    else if(Math.abs(number)>360){
        while(Math.abs(number)>360){
            number = number+360;
        }
        return (360+number)%360;
    }
    else{
        return (360+number)%360;
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number = ");
        String str = in.nextLine();
        int number = Integer.parseInt(str);
        System.out.println("% = "+convertToDegree(number));
        System.out.println("floorMod = "+Math.floorMod(number,360));
    }
}