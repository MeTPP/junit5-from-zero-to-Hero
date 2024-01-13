package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertBooleanConditionTest {

    @Test
    void assertTrue() {
        Assertions.assertTrue(true);

    }

    @Test
    void assertFalse() {
        Assertions.assertFalse(false);
    }

    @Test
    void assertFalse1() {
        Assertions.assertFalse(5 > 4);
    }

}
