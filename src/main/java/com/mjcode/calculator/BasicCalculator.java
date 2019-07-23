package com.mjcode.calculator;

import com.mjcode.operation.IOperation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator {

    public BasicCalculator(String name, Map<Character, IOperation> operationMap) {
        super(name, operationMap);
    }
}
