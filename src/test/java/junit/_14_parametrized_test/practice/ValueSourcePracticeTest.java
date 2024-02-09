package _14_parametrized_test.practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourcePracticeTest {

    /**
     * FIXME: fix this test
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void bytesTest(byte x) {
        System.out.println(x);
    }

    /**
     * TODO: create @Parametrized tests for each available option
     * you will have 9 tests
     * with @ValueSource that provides
     * <ol>
     * <li>shorts</li>
     * <li>bytes</li>
     * <li>floats</li>
     * <li>longs</li>
     * <li>doubles</li>
     * <li>chars</li>
     * <li>boolean</li>
     * <li>string</li>
     * <li>class</li>
     *
     * </ol>
     */
    void testMePlease() {
    }

}
