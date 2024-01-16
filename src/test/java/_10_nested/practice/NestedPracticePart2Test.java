package _10_nested.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedPracticePart2Test {

    /*
     *  TODO: create nested class and two method inside it
     *   tag both of these methods using only one annotation
     */


    int x;

    @BeforeEach
    void setUp() {
        x = 12;
    }


    /**
     * TODO: make _10_nested.practice.NestedPracticePart2Test.FirstClass#test()
     *  and _10_nested.practice.NestedPracticePart2Test.SecondClass#test() at the same time.
     */
    @Nested
    class FirstClass {
        @Test
        void test() {
            Assertions.assertEquals(0, x);
        }

    }

    @Nested
    class SecondClass {
        @Test
        void test() {
            Assertions.assertEquals(5, x);

        }
    }


}
