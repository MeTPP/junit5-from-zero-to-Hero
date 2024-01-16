package _9_test_instance_lifecycle.examples;


import org.junit.jupiter.api.*;

/**
 * JUnit creates a new instance of each test class before executing each test method. It allows test methods
 * to be executed in isolation.
 */
public class FirstTestInstanceLifeCycleExampleTest {


    /**
     * lifecycle method - any method that is annotated or meta-annotated
     * with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.
     */
    @BeforeAll
    static void beforeAllExample() {  // pay attention: it does not work without static modifier
        System.out.println("before ALL tests - run once");
    }

    @BeforeEach
    void beforeEachExample() {
        System.out.println("before each test");
    }


    /**
     * pay attention we have different "this" for each test method.
     */
    @Test
    void test() {
        System.out.println("test. PAY ATTENTION : " + this);
    }

    /**
     * pay attention we have different "this" for each test method.
     */
    @Test
    void test2() {
        System.out.println("test2. PAY ATTENTION : " + this);
    }

    @AfterEach
    void afterEachExample() {
        System.out.println("after each test");
    }

    @AfterAll
    static void afterAllExample() { // pay attention: it does not work without static modifier
        System.out.println("after ALL tests - run once");
    }


}
