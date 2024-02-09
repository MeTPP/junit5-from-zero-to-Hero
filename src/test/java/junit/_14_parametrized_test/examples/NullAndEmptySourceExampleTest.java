package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.List;
import java.util.Set;

public class NullAndEmptySourceExampleTest {

    /**
     * NullSource allows you to pass a null value as one of the parameters to the test method
     */
    @NullSource
    @ParameterizedTest
    void test(String s) {
        Assertions.assertNull(s);
    }

    @NullSource
    @ParameterizedTest
    void test1(List<Object> list) {
        Assertions.assertNull(list);
    }

    /**
     * EmptySource similar to @NullSource, @EmptySource is also used in parameterized tests,
     * but it provides an empty value (like an empty string or an empty collection) as a parameter.
     */
    @EmptySource
    @ParameterizedTest
    void test2(String s) {
        Assertions.assertNotNull(s);
        Assertions.assertTrue(s.isEmpty());
    }

    @EmptySource
    @ParameterizedTest
    void test3(Set<String> set) {
        Assertions.assertNotNull(set);
        Assertions.assertTrue(set.isEmpty());
    }

    /**
     * NullAndEmptySource this is a convenience annotation that combines @NullSource and @EmptySource.
     * It provides both null and empty values as parameters to the test method.
     */
    @NullAndEmptySource
    @ParameterizedTest
    void test4(String s) {
        Assertions.assertTrue(s == null || s.isEmpty());
    }


}
