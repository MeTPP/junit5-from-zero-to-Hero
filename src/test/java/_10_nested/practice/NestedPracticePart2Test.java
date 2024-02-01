package _10_nested.practice;

import org.junit.jupiter.api.*;

public class NestedPracticePart2Test {

    /*
     *  TODO: create nested class and two method inside it
     *   tag both of these methods using only one annotation
     */


    @Nested
    @Tag("nested")
    class NestedClass {
        @Test
        void test1() {
        }

        @Test
        void test2() {
        }

    }


    int x;

    @BeforeEach
    void setUp() {
        x = 12;
    }


    /**
     * TODO: make _10_nested.practice.NestedPracticePart2Test.FirstClass#test()
     *  and _10_nested.practice.NestedPracticePart2Test.SecondClass#test()  green at the same time.
     */
    @Nested
    class FirstClass {

        @BeforeEach
        void setUp() {
            x = 0;
        }

        @Test
        void test() {
            Assertions.assertEquals(0, x);
        }

    }

    @Nested
    class SecondClass {

        @BeforeEach
        void setUp() {
            x = 5;
        }

        @Test
        void test() {
            Assertions.assertEquals(5, x);

        }
    }


}
