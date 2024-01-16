package _8_test_execution_order.practice;

import org.junit.jupiter.api.*;

public class ClassOrderPracticeTestCase {

    /*
     * TODO: create nested class with ClassOrderer.ClassName
     *  and two nested classes inside (each should have at least one @Test method)
     */
    @Nested
    @TestClassOrder(ClassOrderer.ClassName.class)
    class First {

        @Nested
        class B {
            @Test
            void test() {
            }
        }

        @Nested
        class A {

            @Test
            void test() {

            }
        }

    }



    /*
     * TODO: create nested class with ClassOrderer.DisplayName
     *  and two nested classes(with @DisplayName) inside (each should have at least one @Test method)
     */

    @Nested
    @TestClassOrder(ClassOrderer.DisplayName.class)
    class FirstA {

        @Nested
        @DisplayName("B")
        class B {
            @Test
            void test() {
            }
        }

        @Nested
        @DisplayName("A")
        class A {

            @Test
            void test() {

            }
        }

    }

    /*
     * TODO: create nested class with ClassOrderer.OrderAnnotation
     *  and two nested classes(with @Order) inside (each should have at least one @Test method)
     */

    @Nested
    @TestClassOrder(ClassOrderer.OrderAnnotation.class)
    class FirstAB {

        @Nested
        @Order(1)
        class B {
            @Test
            void test() {
            }
        }

        @Nested
        @Order(2)
        class A {

            @Test
            void test() {

            }
        }

    }



    /*
     * TODO: create nested class with ClassOrderer.Random
     *  and two nested classes inside (each should have at least one @Test method)
     */

    @Nested
    @TestClassOrder(ClassOrderer.Random.class)
    class FirstABC {

        @Nested
        @DisplayName("B")
        class B {
            @Test
            void test() {
            }
        }
        @Nested
        @DisplayName("A")
        class A {

            @Test
            void test() {

            }
        }

    }


    /*
     * TODO: create nested class
     *  and two nested classes(with @Order) inside (each should have at least one @Test method)
     *  don't use ClassOrderer.OrderAnnotation
     *  go to file: resources/junit-platform.properties
     *  remove leading _ from _junit.jupiter.testclass.order.default
     *  and run test again
     */

    @Nested
    class FirstABCD {

        @Nested
        @Order(2)
        class A {
            @Test
            void test() {
            }
        }
        @Nested
        @Order(1)
        class B {

            @Test
            void test() {

            }
        }

    }



}
