package _8_test_execution_order.examples;

import org.junit.jupiter.api.*;

public class ClassOrderExampleTestCase {


    @Nested
    @TestClassOrder(ClassOrderer.OrderAnnotation.class)
    class First {
        @Nested
        @DisplayName("i will run second")
        @Order(2)
        class InnerFirst {

            @Test
            void test() {

            }
        }

        @Nested
        @DisplayName("i will run first")
        @Order(1)
        class InnerSecond {
            @Test
            void test() {

            }
        }

    }


}
