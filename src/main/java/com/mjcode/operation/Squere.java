package com.mjcode.operation;

public class Squere  implements IOperation{
    @Override
    public double calculate(double left, double right) {
        return Math.sqrt(right);
    }
}
