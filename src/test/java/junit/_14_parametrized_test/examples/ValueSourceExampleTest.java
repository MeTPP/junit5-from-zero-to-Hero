package junit._14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * _ @ValueSource lets you specify a single array of literal values
 * and can only provide single argument per parameterized test invocation.
 */
public class ValueSourceExampleTest {

    @ParameterizedTest
    @ValueSource(shorts = {1, 1})
    void testTwo(short x) {
        Assertions.assertEquals(1, x);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 1})
    void testOne(int x) {
        Assertions.assertTrue(x > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"from", "zero", "to", "hero"})
    void test(String x) {
        Assertions.assertFalse(x.isEmpty());
    }
}
