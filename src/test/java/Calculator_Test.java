import calculator.Calc;
import static org.junit.Assert.*;
import org.junit.Test;

public class Calculator_Test {
    private static final double DELTA = 1e-15;
    Calc cal = new Calc();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Square Root of number for True Positive", 3.0, cal.squareRoot(9), DELTA);
        assertEquals("Square Root of number for True Positive", 4.0, cal.squareRoot(16), DELTA);
        assertEquals("Square Root of number for True Positive", Double.NaN, cal.squareRoot(-10), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Square Root of number for False Positive", 4.0, cal.squareRoot(10), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, cal.squareRoot(16), DELTA);
        assertNotEquals("Square Root of number for False Positive", 5.0, cal.squareRoot(-16), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Factorial of number for True positive", 6.0,cal.factorial(3), DELTA);
        assertEquals("Factorial of number for True positive", 120.0,cal.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 8.0,cal.factorial(3), DELTA);
        assertNotEquals("Factorial of number for False positive", 60.0,cal.factorial(5), DELTA);
    }

    @Test
    public void naturalLogTruePositive(){
        assertEquals("Factorial of number for True positive", 2.833213344056216,cal.naturalLog(17), DELTA);
        assertEquals("Factorial of number for True positive", 1.791759469228055,cal.naturalLog(6), DELTA);
        assertEquals("Factorial of number for True positive", Double.NaN, cal.naturalLog(0), DELTA);
    }

    @Test
    public void naturalLogFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 2.833213344056216,cal.naturalLog(14), DELTA);
        assertNotEquals("Factorial of number for False positive", 1.791759469228055,cal.naturalLog(9), DELTA);
        assertNotEquals("Factorial of number for False positive", 0, cal.naturalLog(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Factorial of number for True positive", 4.0,cal.power(2, 2), DELTA);
        assertEquals("Factorial of number for True positive", 27.0,cal.power(3,3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Factorial of number for False positive", 4.0,cal.power(2, 3), DELTA);
        assertNotEquals("Factorial of number for False positive", 5.0,cal.power(3,3), DELTA);
    }

}