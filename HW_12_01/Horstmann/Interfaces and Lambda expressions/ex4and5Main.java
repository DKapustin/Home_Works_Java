package com.company;

public class Main {

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.print(sequence.next());
        }
        System.out.println();
        IIntSequence infinity = IIntSequence.constant(1);
        for (int i=0;i<20;i++)
            System.out.print(infinity.next());
    }
}
