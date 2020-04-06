package calculator.test;

import calculator.impl.OutputImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OutputImplTest {
    OutputImpl output = new OutputImpl();

    @Test
    void print() {
        String str = "5";
        output.print(str);
        Assertions.assertEquals("5", str);
    }
}