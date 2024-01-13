package _12_test_interfaces_and_default_methods.examples;

import org.junit.jupiter.api.*;

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

    @AfterEach
    default void tearDown() {
        System.out.println("after each");
    }

    @AfterAll
    default void afterAll() {
        System.out.println("after all");
    }
}