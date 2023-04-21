import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class PlusTest {
    @Test
    public void positiveTest() {
        Calculator calculator = new Calculator();
        assertEquals(Long.valueOf(376), Long.valueOf(calculator.plus.apply(353,23)));
    }
    @Test
    public void negativeTest() {
        Calculator calculator = new Calculator();
        assertEquals(-1, (int) calculator.plus.apply(MAX_VALUE, MIN_VALUE));
    }
}
