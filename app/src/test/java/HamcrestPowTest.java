import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class HamcrestPowTest {
    @Test
    public void positiveTest()
    {
        Calculator calculator = new Calculator();
        assertThat(calculator.pow.apply(10), is(equalTo(100)));
    }
}
