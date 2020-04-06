package calculator;

import calculator.abstraction.*;
import calculator.exception.CalculatorExeption;
import calculator.impl.*;


public class Main {
    static String numberFormat = "Grech";

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите операцию:");
            Input input = new InputImpl();
            Validator validator = new ValidatorImpl();
            Processor processor = new ProcessorImpl();
            Converter converter = new ConverterImpl();
            CalculatorOperation calculatorOperation = new CalculatorOperationImpl();
            Output output = new OutputImpl();

            String strInConsole = input.inputNext();
            validator.validatorCheck(strInConsole);

            numberFormat = processor.processor(strInConsole);
            String operation = converter.operationString(strInConsole);
            if (operation == null) {
                throw new CalculatorExeption("Ошибка ввода: Вводите корректный знак + - / *");
            }
            int number1 = converter.converterNumber1(strInConsole, numberFormat);
            int number2 = converter.converterNumber2(strInConsole, numberFormat);
            if (number1 > 10 || number1 < 1 || number2 > 10 || number2 < 1) {
                throw new CalculatorExeption("Ошибка ввода: Вводите числа от 1 до 10 или от I до X");
            }
            int result = 0;

            if (operation.equals("+")) {
                result = calculatorOperation.plus(number1, number2);
            } else if (operation.equals("-")) {
                result = calculatorOperation.minus(number1, number2);
            } else if (operation.equals("*")) {
                result = calculatorOperation.multi(number1, number2);
            } else if (operation.equals("/")) {
                result = calculatorOperation.division(number1, number2);
            } else
                throw new CalculatorExeption("Ошибка ввода !!!");
            if (numberFormat.equals("Grech")) {
                output.print("" + result);
            } else if (numberFormat.equals("Rim")) {
                output.print(converter.convertRim(result));
            }


        }

    }
}