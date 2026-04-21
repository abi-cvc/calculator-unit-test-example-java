package ec.edu.epn.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int result = calculator.sum(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testMinus() {
        int result = calculator.minus(2, 2);
        assertEquals(0, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testDivideSuccess() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideFail() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
