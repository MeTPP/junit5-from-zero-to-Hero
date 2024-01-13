package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedExampleTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void test(int x) {
        Assertions.assertTrue(x < 0);
    }
}
