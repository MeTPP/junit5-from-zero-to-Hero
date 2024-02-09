package junit._10_nested.examples;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Nested tests give the test writer more capabilities to express the relationship among several groups of tests.
 */
@DisplayName("number range tests")
public class NestedExampleTest {

    int zero = 0;
    int positive = 15;
    int negative = -15;

    @Test
    @DisplayName("zero test")
    void zeroTest() {
        Assertions.assertEquals(0, zero);
    }

    @Nested
    @DisplayName("only positives numbers")
    class Positive {
        @Test
        void whenPositiveProvided_thenAssertTrue() {
            Assertions.assertTrue(positive > 0);
        }

        @Test
        void whenNegativeProvided_thenAssertFalse() {
            Assertions.assertFalse(negative > 0);
        }
    }

    @Nested
    @DisplayName("only negative numbers")
    class Negative {
        @Test
        void whenPositiveProvided_thenAssertFalse() {
            Assertions.assertFalse(positive < 0);
        }

        @Test
        void whenNegativeProvided_thenAssertTrue() {
            Assertions.assertTrue(negative < 0);
        }

    }


}
