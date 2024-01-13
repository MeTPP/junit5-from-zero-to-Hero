package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertSameExampleTest {

    String firstName = "x";
    String secondName = "x";

    @Test
    void test() {
        Assertions.assertNotSame(firstName, secondName);
    }

    @Test
    void test1() {
        Assertions.assertNotSame(firstName, secondName, "should not be same ");
    }

    @Test
    void test2() {
        Assertions.assertNotSame(firstName, secondName, () -> "should not be same ");
    }
}
