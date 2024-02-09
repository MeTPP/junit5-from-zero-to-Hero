package _10_nested.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedBeforeEachBehaviourExampleTest {

    @BeforeEach
    void setup() {
        System.out.println("parent.beforeEach");
    }

    @Nested
    class FirstNestedClass {

        @BeforeEach
        void setUp() {
            System.out.println("FirstNestedClass.beforeEach");
        }

        @Test
        void test() {
        }
    }

    @Nested
    class SecondNestedClass {
        @BeforeEach
        void setUp() {
            System.out.println("SecondNestedClass.beforeEach");
        }

        @Test
        void test() {

        }
    }


}
