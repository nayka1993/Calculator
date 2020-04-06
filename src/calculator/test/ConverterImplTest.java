package calculator.test;

import calculator.impl.ConverterImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterImplTest {
    ConverterImpl converter = new ConverterImpl();

    @Test
    void converterNumber1() {
        int result = converter.converterNumber1("8+3", "Grech");
        Assertions.assertEquals(8, result);
        int result2 = converter.converterNumber1("V+VI", "Rim");
        Assertions.assertEquals(5, result2);
    }

    @Test
    void converterNumber2() {
        int result = converter.converterNumber2("8+3", "Grech");
        Assertions.assertEquals(3, result);
        int result2 = converter.converterNumber2("V+VI", "Rim");
        Assertions.assertEquals(6, result2);
    }

    @Test
    void operationString() {
        String str = converter.operationString("2-2");
        Assertions.assertEquals("-", str);
    }

    @Test
    void convertRim() {
        String result = converter.convertRim(1);
        Assertions.assertEquals("I", result);
    }

    @Test
    void convertGrech() {
        int result = converter.convertGrech("I");
        Assertions.assertEquals(1, result);

    }
}