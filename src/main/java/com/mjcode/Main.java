package com.mjcode;

import com.mjcode.calculator.CalculatorHolder;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {

        CalculatorHolder calculatorHolder = new CalculatorHolder();
        System.out.println("Hello " +  Math.pow(4,2));

        do{
            System.out.println("Write number, then type of com.mjcode.operation (+,-,*,/) i.e.: 6/2 or 3+3");

            final double left;
            final char operator;
            final double right;

            left = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            right = scanner.nextDouble();

            Operands operands = new Operands(left,right);
            calculatorHolder.calculate(operands, operator);

            System.out.println(operands.getLeft() + " "+ operands.getRight());

        } while (true);

    }


}
