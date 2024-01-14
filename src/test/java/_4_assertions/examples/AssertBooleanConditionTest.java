package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * assertTrue/assertFalse - simply assert that the supplied condition is true/false respectively.
 */
public class AssertBooleanConditionTest {

    /**
     * expect true condition
     */
    @Test
    void assertTrue() {
        Assertions.assertTrue(true);
    }


    /**
     * expect false condition
     */
    @Test
    void assertFalse() {
        Assertions.assertFalse(false);
    }

    @Test
    void assertFalse1() {
        Assertions.assertFalse(5 > 4);
    }

}
