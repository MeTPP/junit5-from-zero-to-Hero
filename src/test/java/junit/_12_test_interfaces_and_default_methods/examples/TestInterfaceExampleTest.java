package junit._12_test_interfaces_and_default_methods.examples;

import org.junit.jupiter.api.*;

/**
 * JUnit Jupiter allows @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, @TestTemplate
 * and @BeforeEach, @AfterEach to be declared on interface default methods
 */
public class TestInterfaceExampleTest implements TestLifecycleLogger {

    @Test
    void test() {
    }

}


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
interface TestLifecycleLogger {

    @BeforeAll
    default void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    default void setUp() {
        System.out.println("before each");
    }

    @Test
    default void interfaceTest() {
        Assertions.assertTrue(true);
    }

    @AfterEach
    default void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    default void afterAll() {
        System.out.println("after all");
    }
}