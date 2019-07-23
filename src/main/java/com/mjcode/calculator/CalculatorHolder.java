package com.mjcode.calculator;

import com.mjcode.Operands;
import com.mjcode.operation.Addition;
import com.mjcode.operation.Division;
import com.mjcode.operation.Multiplication;
import com.mjcode.operation.Subtraction;

import java.util.HashMap;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder(){
        initializeCalculators();
    }

    private void initializeCalculators(){
        this.basicCalculator = new BasicCalculator(
                "BasicCalculator",
                new HashMap<>(){{
                    put('+', new Addition());
                    put('-', new Subtraction());
                }}
        );
        this.advancedCalculator = new AdvancedCalculator(
                "AdvancedCalculator",
                new HashMap<>(){{
                    put('*', new Multiplication());
                    put('/', new Division() );
                }}
        );
    }

    public double calculate(Operands operands, Character operator){
        return getSuitableCalculator(operator).calculate(operands,operator);
    }

    private AbstractCalculator getSuitableCalculator(Character operator){
        switch (operator){
            case '+':
            case '-':
                return basicCalculator;
            case '*':
            case '/':
                return advancedCalculator;
            default:
                throw  new IllegalArgumentException("Unsupported operation");
        }
    }
}
