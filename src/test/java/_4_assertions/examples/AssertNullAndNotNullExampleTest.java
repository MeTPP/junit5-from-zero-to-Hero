package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullAndNotNullExampleTest {

    String name = null;
    String secondName = "";

    @Test
    void test1() {
        Assertions.assertNull(name);
    }

    @Test
    void test() {
        Assertions.assertNull(name, "should be null");
    }

    @Test
    void test2() {
        Assertions.assertNull(name, () -> "should  be null");
    }


    @Test
    void test3() {
        Assertions.assertNotNull(secondName);
    }

    @Test
    void test4() {
        Assertions.assertNotNull(secondName, "should not be null");
    }

    @Test
    void test5() {
        Assertions.assertNotNull(secondName, () -> "should not be null");
    }


}
