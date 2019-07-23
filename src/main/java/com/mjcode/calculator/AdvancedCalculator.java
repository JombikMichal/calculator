package com.mjcode.calculator;

import com.mjcode.operation.IOperation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<Character, IOperation> operationMap) {
        super(name, operationMap);
    }
}
