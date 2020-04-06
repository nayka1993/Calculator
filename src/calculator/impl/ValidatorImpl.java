package calculator.impl;

import calculator.abstraction.Validator;
import calculator.exception.CalculatorExeption;

public class ValidatorImpl implements Validator {

    @Override
    public boolean validatorCheck(String str) {
        /*
        Метод проверяет строку от ввода пользователем не корректных данных.
         */
        if (str.isEmpty()) {
            throw new CalculatorExeption("Ошибка ввода: Пустая строка");
        } else if (str.length() > 9) {
            throw new CalculatorExeption("Ошибка ввода: Похоже вы вводите что-то не нужное...");
        } else if (str.contains(" ")) {
            throw new CalculatorExeption("Ошибка ввода: Вводить пробел нельзя ! Пример корректного ввода 1+1");
        }
        return false;
    }
}
