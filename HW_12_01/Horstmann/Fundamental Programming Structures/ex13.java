package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
	    //int[] array = new int[49];
	    for (int i=0;i<49;i++){
	        array.add(i+1);
        }
        ArrayList<Integer> lottery = new ArrayList<>();
	    for (int j=0;j<6;j++){
            int min = 1;
            int max = array.size();
            Random random = new Random();
            int curr = random.nextInt(max-min+1);
            curr+=min;
            lottery.add(curr);
            array.remove(curr-1);
        }
        System.out.println(array);
        Collections.sort(lottery);
        System.out.println(lottery);
    }
}
