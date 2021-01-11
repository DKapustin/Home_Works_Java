package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static void luckySort (ArrayList<String> strings, Comparator<String> comp){
        boolean flag = false;
        while (!flag){
            for (int i=0;i<strings.size()-1;i++){
                flag = true;
                if ( comp.compare(strings.get(i),strings.get(i+1))>0) {
                    Collections.shuffle(strings);
                    flag = false;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("z");
        strings.add("c");
        strings.add("b");
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }
        };
        System.out.println(strings);
        luckySort(strings,comp);
        System.out.println(strings);
    }
}