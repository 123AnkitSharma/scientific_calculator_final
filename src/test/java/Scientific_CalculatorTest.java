import static org.junit.Assert.*;
import org.junit.Test;

public class Scientific_CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Scientific_Calculator.squareRoot(25.0), 0.0001);
        assertEquals(3.0, Scientific_Calculator.squareRoot(9.0), 0.0001);
        try {
            Scientific_Calculator.squareRoot(-4.0);
            fail("Expected IllegalArgumentException for negative input.");
        } catch (IllegalArgumentException e) {
            assertEquals("Square root of negative number is not defined.", e.getMessage());
        }
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Scientific_Calculator.factorial(5));
        assertEquals(1, Scientific_Calculator.factorial(0));
        assertEquals(1, Scientific_Calculator.factorial(1));
        try {
            Scientific_Calculator.factorial(-3);
            fail("Expected IllegalArgumentException for negative input.");
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial of negative number is not defined.", e.getMessage());
        }
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Scientific_Calculator.naturalLogarithm(1.0), 0.0001);
        assertEquals(Math.log(10), Scientific_Calculator.naturalLogarithm(10.0), 0.0001);
        try {
            Scientific_Calculator.naturalLogarithm(0.0);
            fail("Expected IllegalArgumentException for zero input.");
        } catch (IllegalArgumentException e) {
            assertEquals("Logarithm of zero or negative number is not defined.", e.getMessage());
        }
        try {
            Scientific_Calculator.naturalLogarithm(-1.0);
            fail("Expected IllegalArgumentException for negative input.");
        } catch (IllegalArgumentException e) {
            assertEquals("Logarithm of zero or negative number is not defined.", e.getMessage());
        }
    }

    @Test
    public void testPowerFunction() {
        assertEquals(8.0, Scientific_Calculator.powerFunction(2.0, 3.0), 0.0001);
        assertEquals(1.0, Scientific_Calculator.powerFunction(5.0, 0.0), 0.0001);
        assertEquals(0.25, Scientific_Calculator.powerFunction(2.0, -2.0), 0.0001);
    }
}
