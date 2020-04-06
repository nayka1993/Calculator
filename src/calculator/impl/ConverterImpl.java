package calculator.impl;

import calculator.abstraction.Converter;
import calculator.exception.CalculatorExeption;

public class ConverterImpl implements Converter {
    String[] rimBook = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
            "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV",
            "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
            "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
            "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


   /*
     Метод convertNumber1- принимает на вход строку из консоли и строку формата чисел которую
     мы выявили из метода ProcessorImpl.Если число обычное, то мы просто достаём его из строки и возвращаем,
     а если число римское - мы достаём его из нашей пришедшей строки и запихиваем в новую,
     полученное римское число мы возвращаем через convertGrech(конвертируем римское число в обычно).
     */

    @Override
    public int converterNumber1(String str, String numberFormat) {
        int num1 = 0;
        if (numberFormat.equals("Grech")) {
            try {
                num1 = Integer.parseInt(str.substring(0, str.indexOf(operationString(str))));
            } catch (NumberFormatException e) {
                throw new CalculatorExeption("Ошибка ввода: Вводите числа от 1 до 10 или от I до X");
            }

            return num1;
        } else {
            String element = str.substring(0, str.indexOf(operationString(str)));
            return convertGrech(element);
        }
    }

    /*
     Метод convertNumber2- принимает на вход строку из консоли и строку формата чисел которую
     мы выявили из метода ProcessorImpl.Если число обычное, то мы просто достаём его из строки и возвращаем,
     а если число римское - мы достаём его из нашей пришедшей строки и запихиваем в новую,
     полученное римское число мы возвращаем через convertGrech(конвертируем римское число в обычно).
     */

    @Override
    public int converterNumber2(String str, String numberFormat) {
        int num2 = 0;
        if (numberFormat.equals("Grech")) {
            try {
                num2 = Integer.parseInt(str.substring(str.indexOf(operationString(str)) + 1));
            } catch (NumberFormatException e) {
                throw new CalculatorExeption("Ошибка ввода: Вводите числа от 1 до 10 или от I до X");
            }

            return num2;
        } else {
            String element = str.substring(str.indexOf(operationString(str)) + 1);
            return convertGrech(element);
        }
    }

    /*
     Метод operationString - принимает на вход строку, ищет в строке + - / *
     создаёт новую строку,которой присваивает + или - или / или * и возвращает её.
      */

    @Override
    public String operationString(String str) {
        String[] checkOperation = {"+", "-", "/", "*",};
        String operation = null;
        for (int i = 0; i < checkOperation.length; i++) {
            if (str.contains(checkOperation[i])) {
                operation = checkOperation[i];
            }
        }
        return operation;
    }

    /*
     Метод convertRim - принимает на вход целое число (обычное число) и
     возвращает значение этого числа в римском формате.
     */

    @Override
    public String convertRim(int a) {
        for (int i = rimBook.length; i > 0; i--) {
            if (a == i) {
                return rimBook[i - 1];
            }
        }
        return null;
    }

    /*
     Метод convertGrech - принимает на вход строку (римское число) и
     возвращает значение этого числа в обычном формате.
     */

    @Override
    public int convertGrech(String str) {
        for (int i = 0; i < rimBook.length; i++) {
            if (str.equals(rimBook[i])) {
                return i + 1;
            }
        }
        return 0;
    }
}
