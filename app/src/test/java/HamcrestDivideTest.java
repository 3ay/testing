import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class HamcrestDivideTest {
    @Test
    public void positiveTest() {
        Calculator calculator = new Calculator();
        double resultValue = calculator.divideFirstVariant.apply(7.87,32.0);
        assertThat(resultValue, closeTo(0.25,0.24));
    }
}
