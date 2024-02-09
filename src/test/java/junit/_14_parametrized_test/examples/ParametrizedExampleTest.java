package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * Parameterized tests make it possible to run a test multiple times with different arguments.
 */
public class ParametrizedExampleTest {


    /**
     * Parameterized test = @ParameterizedTest +
     * source of arguments(that provides the arguments to each invocation) +
     * consumption of these arguments in test method
     */
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3})
    void test(int x) {
        Assertions.assertTrue(x < 0);
    }
}
