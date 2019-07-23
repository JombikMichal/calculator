package com.mjcode.calculator;

import com.mjcode.operation.IOperation;

import java.util.Map;

public class ProfessionalCalculator extends AbstractCalculator {
    public ProfessionalCalculator(String name, Map<Character, IOperation> operationMap) {
        super(name, operationMap);
    }
}
