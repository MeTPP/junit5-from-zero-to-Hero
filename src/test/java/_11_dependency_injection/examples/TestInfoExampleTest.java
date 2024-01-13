package _11_dependency_injection.examples;

import org.junit.jupiter.api.*;

public class TestInfoExampleTest {

    @Test
    void test(TestInfo testInfo) {
        Assertions.assertEquals(testInfo.getTestClass().orElseThrow(), TestInfoExampleTest.class);
    }


}
