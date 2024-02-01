package _12_test_interfaces_and_default_methods.practice;

import org.junit.jupiter.api.*;

public class TestInterfacePracticeTest {

    /*
     * TODO: create interface and methods annotated with:
     *  @BeforeAll @BeforeEach @Test @AfterEach @AfterAll
     *  then create nested class, implement your interface and run test.
     */

    @Nested
    class NestedClass implements DefaultExampleTest {

    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    interface DefaultExampleTest {


        @BeforeAll
        default void beforeAll() {
            System.out.println("beforeAll");
        }

        @BeforeEach
        default void setUp() {
            System.out.println("BeforeEach");
        }

        @Test
        default void name() {
            System.out.println("test");
        }

        @AfterEach
        default void tearDown() {
            System.out.println("AfterEach");

        }

        @AfterAll
        static void afterAll() {
            System.out.println("afterAll");

        }
    }

}
