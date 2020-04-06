package calculator.impl;

import calculator.abstraction.CalculatorOperation;

public class CalculatorOperationImpl implements CalculatorOperation {
    /*
     Методы plus,minus,multi,division - принимают на вход 2 целых числа и возвращают их значение,
     взависимости от метода в который их прислали.
     */
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multi(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }
}
