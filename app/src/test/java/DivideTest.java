import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DivideTest {

    @Test
    public void positiveTest() {
        Calculator calculator = new Calculator();
        assertEquals(Optional.of(4), calculator.divideSecondVariant.apply(32.0,8.0));
    }
    @Test
    public void negativeTest() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.divideSecondVariant.apply(23.0, 0.0) == Double.POSITIVE_INFINITY);
    }
}
