package calculator.test;

import calculator.impl.CalculatorOperationImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorOperationImplTest {
    CalculatorOperationImpl calculatorOperation = new CalculatorOperationImpl();

    @Test
    void plus() {
        int result = calculatorOperation.plus(3, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void minus() {
        int result = calculatorOperation.minus(3, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    void multi() {
        int result = calculatorOperation.multi(3, 2);
        Assertions.assertEquals(6, result);
    }

    @Test
    void division() {
        int result = calculatorOperation.division(4, 2);
        Assertions.assertEquals(2, result);
    }
}