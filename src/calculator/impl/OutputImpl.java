package calculator.impl;

import calculator.abstraction.Output;

public class OutputImpl implements Output {
    /*
    Метод принимает строку, и выводит ее в консоль.
     */
    @Override
    public void print(String str) {
        System.out.println("Ваш ответ: " + str);
    }
}
