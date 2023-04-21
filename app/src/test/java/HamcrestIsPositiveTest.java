import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestIsPositiveTest {
    @Test
    public void positiveTest()
    {
        Calculator calculator = new Calculator();
        boolean actualValue = calculator.isPositive.test(-4204);
        assertThat(actualValue, Matchers.not(false));
    }
}
