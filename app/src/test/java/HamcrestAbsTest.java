import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestAbsTest {
    @Test
    public void positiveTest()
    {
        Calculator calculator = new Calculator();
        int actualValue = calculator.abs.apply(-4204);
        assertThat(actualValue, allOf(greaterThan(0)));
    }
}
