package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceExampleTest {

    @ParameterizedTest
    @ValueSource(shorts = {1, 1})
    void test(short x) {
        Assertions.assertEquals(1, x);
    }

}
