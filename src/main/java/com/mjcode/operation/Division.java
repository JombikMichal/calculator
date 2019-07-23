package com.mjcode.operation;

public class Division implements IOperation {
    @Override
    public double calculate(double left, double right) {
        return left / right;
    }
}
