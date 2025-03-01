import static org.junit.Assert.*;
import org.junit.Test;

public class Scientific_CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Scientific_Calculator.squareRoot(25.0), 0.0001);
        assertEquals(3.0, Scientific_Calculator.squareRoot(9.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Scientific_Calculator.factorial(5));
        assertEquals(1, Scientific_Calculator.factorial(0));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Scientific_Calculator.naturalLogarithm(1.0), 0.0001);
        assertEquals(Math.log(10), Scientific_Calculator.naturalLogarithm(10.0), 0.0001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(8.0, Scientific_Calculator.powerFunction(2.0, 3.0), 0.0001);
    }
}
