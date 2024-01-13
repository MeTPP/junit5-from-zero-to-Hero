package _14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;

import java.util.Objects;

public class NullAndEmptySourcePracticeTest {

    /**
     * FIXME: create parametrized test and make test green
     * <p>provide null String using one annotation</p>
     */
    void testNullString(String nullString) {
        Assertions.assertThrows(NullPointerException.class, () -> isEmpty(nullString));
    }


    /**
     * TODO: create parametrized test and make test green
     * <p>provide empty String using one annotation</p>
     */
    void testEmptyString(String x) {
        Assertions.assertTrue(isEmpty(x));
    }

    /**
     * TODO: create parametrized test and make test green
     * <p>provide <b>empty and null</b> string using <b>only one</b>  annotation</p>
     */
    void testEmptyAndNullString(String x) {
        Assertions.assertTrue(Objects.isNull(x) || isEmpty(x));
    }


    boolean isEmpty(String x) {
        return x.isEmpty();
    }

}
