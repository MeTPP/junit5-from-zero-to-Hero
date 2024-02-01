package _14_parametrized_test.practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourcePracticeTest {

    /**
     * FIXME: fix this test
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void bytesTest(int x) {
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
    @ParameterizedTest
    @ValueSource(shorts = {1})
    void testMePlease(short s) {
    }

    @ParameterizedTest
    @ValueSource(bytes = {1})
    void testMePlease(byte s) {
    }

    @ParameterizedTest
    @ValueSource(floats = {1f})
    void testMePlease(float f) {
    }

    @ParameterizedTest
    @ValueSource(longs = {1L})
    void testMePlease(long f) {
    }

    @ParameterizedTest
    @ValueSource(doubles = {1d})
    void testMePlease(double f) {
    }

    @ParameterizedTest
    @ValueSource(chars = {'x'})
    void testMePlease(char f) {
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    void testMePlease(boolean f) {
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "junit5", "hero!"})
    void testMePlease(String f) {
    }

    @ParameterizedTest
    @ValueSource(classes = {String.class})
    void testMePlease(Class f) {
    }

}
