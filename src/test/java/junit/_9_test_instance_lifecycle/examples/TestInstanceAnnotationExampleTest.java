package junit._9_test_instance_lifecycle.examples;

import org.junit.jupiter.api.*;


/**
 * If you prefer execute all test methods on the same test instance,
 * annotate your test class with @TestInstance(Lifecycle.PER_CLASS)
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceAnnotationExampleTest {


    /**
     * lifecycle method - any method that is annotated or meta-annotated
     * with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.
     */
    @BeforeAll
    void beforeAllExample() {  // pay attention: it works without static modifier
        System.out.println("before ALL tests - run once");
    }

    @BeforeEach
    void beforeEachExample() {
        System.out.println("before each test");
    }


    /**
     * pay attention we have SAME "this" for each test method.
     */
    @Test
    void test() {
        System.out.println("test. PAY ATTENTION : " + this);
        System.out.println("test");
    }


    /**
     * pay attention we have SAME "this" for each test method.
     */
    @Test
    void test2() {
        System.out.println("test2. PAY ATTENTION : " + this);
        System.out.println("test2");
    }

    @AfterEach
    void afterEachExample() {
        System.out.println("after each test");
    }

    @AfterAll
    void afterAllExample() { // pay attention: it does not work without static modifier
        System.out.println("after ALL tests - run once");
    }
}
