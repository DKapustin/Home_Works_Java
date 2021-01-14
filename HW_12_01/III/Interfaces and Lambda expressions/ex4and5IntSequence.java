package com.company;

public class IntSequence {
    public int next() {
        return -1;
    }

    public boolean hasNext() {
        return false;
    }

    public static IntSequence of(int... seq) {
        return new IntSequence() {
            private int[] s = seq;
            private int current = 0;

            @Override
            public int next() {
                return s[current++];
            }

            @Override
            public boolean hasNext() {
                if (current < s.length)
                    return true;
                return false;
            }
        };
    }
}