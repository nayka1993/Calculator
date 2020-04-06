package calculator.impl;

import calculator.abstraction.Processor;

public class ProcessorImpl implements Processor {
    /*
    Метод проверяет какие числа используются в строке обычные или римские,
    и взависимости от этого возвращает определённую строку.
     */
    @Override
    public String processor(String str) {
        if (str.contains("I") || str.contains("V") || str.contains("X")) {
            return "Rim";
        } else return "Grech";
    }
}
