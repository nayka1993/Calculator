package calculator.test;

import calculator.exception.CalculatorExeption;
import calculator.impl.ValidatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidatorImplTest {
    ValidatorImpl validator = new ValidatorImpl();

    @Test
    void validatorCheck() {
        boolean bo = validator.validatorCheck("2+2");
        Assertions.assertEquals(false, bo);

        boolean bo1 = validator.validatorCheck("I+II");
        Assertions.assertEquals(false, bo1);

        boolean bo2 = validator.validatorCheck("I+2");
        Assertions.assertEquals(false, bo2);

        try {
            boolean bo3 = validator.validatorCheck("321321+321321");
            Assertions.assertEquals(true, bo3);
        } catch (CalculatorExeption ignored) {
        }

        try {
            boolean bo4 = validator.validatorCheck("");
            Assertions.assertEquals(true, bo4);
        } catch (CalculatorExeption ignored) {
        }

        try {
            boolean bo5 = validator.validatorCheck(" ");
            Assertions.assertEquals(true, bo5);
        } catch (CalculatorExeption ignored) {
        }


    }
}