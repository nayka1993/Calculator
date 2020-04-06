package calculator.test;

import calculator.impl.ProcessorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcessorImplTest {
    ProcessorImpl processor = new ProcessorImpl();

    @Test
    void processor() {
        String str = processor.processor("I+II");
        Assertions.assertEquals("Rim", str);

        String str2 = processor.processor("3/2");
        Assertions.assertEquals("Grech", str2);

        String str3 = processor.processor("I/1");
        Assertions.assertEquals("Rim", str3);
    }
}