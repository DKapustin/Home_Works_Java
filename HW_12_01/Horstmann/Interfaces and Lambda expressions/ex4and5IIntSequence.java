package com.company;

public interface IIntSequence {
    int next();
    static IIntSequence constant(int i)
    {
        return() -> i;
    }
}
