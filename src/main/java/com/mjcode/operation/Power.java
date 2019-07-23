package com.mjcode.operation;

public class Power implements IOperation{
    @Override
    public double calculate(double base, double exponent) {
        if(exponent >= 1){
            return base*calculate(base,exponent-1);
        }return 1;
    }
}
