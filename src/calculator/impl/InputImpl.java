package calculator.impl;

import calculator.abstraction.Input;

import java.util.Scanner;

public class InputImpl implements Input {
/*
Метод считывает строку из консоли и возвращает ее.
 */
    @Override
    public String inputNext() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
