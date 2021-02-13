
import static org.junit.Assert.*;
import org.junit.Test;

public class Calcuator_test {
    private static final double DELTA = 1e-15;
    Calcuator obj = new Calcuator();

    @Test
    public void squarerootTruePositive() {
        assertEquals("Square Root of number for True Positive", 2.0, obj.squareroot(4), DELTA);
        assertEquals("Square Root of number for True Positive", 3.0, obj.squareroot(9), DELTA);
    }

    @Test
    public void squarerootFalsePositive() {
        assertNotEquals("Square Root of number for  False Positive", 3, obj.squareroot(16), DELTA);
        assertNotEquals("Square Root of number for  False Positive", 2, obj.squareroot(10), DELTA);
    }

    @Test
    public void factorialsTruePositive() {
        assertEquals("Factorial of a number for True Positive", 120, obj.factorials(5), DELTA);
        assertEquals("Factorial of a number for True Positive", 6, obj.factorials(3), DELTA);
    }

    @Test
    public void factorialsFalsePositive() {
        assertNotEquals("Factorial of a number for False Positive", 1, obj.factorials(2), DELTA);
        assertNotEquals("Factorial of a number for False Positive", 5, obj.factorials(3), DELTA);
    }

    @Test
    public void naturallogTruePositive() {
        assertEquals("Natural log of a number for True Positive", 2.302585092994046, obj.naturallog(10), DELTA);
        assertEquals("Natural log of a number for True Positive", 2.8903717578961645, obj.naturallog(18), DELTA);
    }

    @Test
    public void naturallogFalsePositive() {
        assertNotEquals("Natural log of a number for False Positive", 1.2, obj.naturallog(10), DELTA);
        assertNotEquals("Natural log of a number for False Positive", 3.3, obj.naturallog(18), DELTA);
    }

    @Test
    public void powerfunTruePositive() {
        assertEquals("Natural log of a number for True Positive", 9.0, obj.powerfun(3, 2), DELTA);
        assertEquals("Natural log of a number for True Positive", 4.0, obj.powerfun(2, 2), DELTA);
    }

    @Test
    public void powerfunFalsePositive() {
        assertNotEquals("Natural log of a number for False Positive", 8.0, obj.powerfun(4, 2), DELTA);
        assertNotEquals("Natural log of a number for False Positive", 3.0, obj.powerfun(3, 3), DELTA);

    }
}



