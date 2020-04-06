package calculator.abstraction;

public interface Converter {
    int converterNumber1(String str, String numberFormat);
    int converterNumber2(String str, String numberFormat);
    String operationString(String str);
    String convertRim(int a);
    int convertGrech(String str);

}
