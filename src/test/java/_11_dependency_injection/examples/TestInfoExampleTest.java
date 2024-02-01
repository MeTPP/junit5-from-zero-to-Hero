package _11_dependency_injection.examples;

import org.junit.jupiter.api.*;


/**
 * test constructors and methods are permitted to have parameters.
 * This allows for greater flexibility and enables DI for constructors and methods.
 */

@Tag("test")
public class TestInfoExampleTest {

    public TestInfoExampleTest(TestInfo testInfo) {
        System.out.println(testInfo.getTags());
    }

    @Test
    void test(TestInfo testInfo) {
        Assertions.assertEquals(testInfo.getTestClass().orElseThrow(), TestInfoExampleTest.class);
    }


}
