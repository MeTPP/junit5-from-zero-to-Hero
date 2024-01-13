package _17_timeouts.examples;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TimeoutWithParametrizedExampleTest {


    @ParameterizedTest
    @Timeout(1)
    @ValueSource(ints = {1, 2, 3, 4})
    void eachTestShouldFailAfterOneSecond(int input) throws InterruptedException {
        Thread.sleep(1100);
    }
}
