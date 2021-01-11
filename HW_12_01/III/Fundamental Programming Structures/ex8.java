package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String = ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
