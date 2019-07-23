package com.mjcode.calculator;

import com.mjcode.Operands;
import com.mjcode.operation.IOperation;
import jdk.dynalink.Operation;

import java.util.Map;

abstract class AbstractCalculator {
    private String name;
    private Map<Character, IOperation> operationMap;

    AbstractCalculator(String name, Map<Character,IOperation> operationMap){
        this.name = name;
        this.operationMap = operationMap;
    }

    double calculate(Operands operands, Character operator){
        if(operationMap.containsKey(operator)){
            // calculate result
            final double result = calculateResult(operands,operationMap.get(operator));
            printResult(result);
            return result;
        }else{
            throw new IllegalArgumentException("This calculator doesnt support operator " + operator);
        }
    }

    private double calculateResult(Operands operands, IOperation operation){
       return operation.calculate(operands.getLeft(),operands.getRight());
    }

    private void printResult(double result){
        System.out.println(this.name + " calculated result: " + result);
    }
}
