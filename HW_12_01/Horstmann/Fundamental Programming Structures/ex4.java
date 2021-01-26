package com.company;

import static java.lang.Double.MAX_VALUE;

public class Main {

    public static void main(String[] args) {
	    double min = 0.0;
        System.out.println(Math.nextUp(min));
        double max  = MAX_VALUE;
        System.out.println(MAX_VALUE);
        System.out.println(Math.nextUp(max));
    }
}