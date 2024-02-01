package _14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Objects;

public class NullAndEmptySourcePracticeTest {

    /**
     * FIXME: create parametrized test and make test green
     * <p>provide null String using one annotation</p>
     */
    @NullSource
    @ParameterizedTest
    void testNullString(String nullString) {
        Assertions.assertThrows(NullPointerException.class, () -> isEmpty(nullString));
    }


    /**
     * TODO: create parametrized test and make test green
     * <p>provide empty String using one annotation</p>
     */
    @EmptySource
    @ParameterizedTest
    void testEmptyString(String x) {
        Assertions.assertTrue(isEmpty(x));
    }

    /**
     * TODO: create parametrized test and make test green
     * <p>provide <b>empty and null</b> string using <b>only one</b>  annotation</p>
     */
    @ParameterizedTest
    @NullAndEmptySource
    void testEmptyAndNullString(String x) {
        Assertions.assertTrue(Objects.isNull(x) || isEmpty(x));
    }


    boolean isEmpty(String x) {
        return x.isEmpty();
    }

}
