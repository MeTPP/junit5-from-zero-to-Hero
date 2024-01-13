package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualityExampleTest {


    @Test
    void test() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    void test1() {
        Assertions.assertEquals(1, 0, "should be equal");
    }

    @Test
    void test2() {
        Assertions.assertEquals(2, 1, () -> "should be equal");
    }


}
