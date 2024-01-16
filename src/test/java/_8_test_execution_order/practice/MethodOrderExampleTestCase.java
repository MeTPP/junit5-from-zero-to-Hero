package _8_test_execution_order.practice;

import org.junit.jupiter.api.*;

import java.util.Set;
import java.util.function.Predicate;

public class MethodOrderExampleTestCase {

    /*
     * TODO: create nested class with MethodOrderer.DisplayName
     *  and two methods with @display
     */

    @Nested
    @TestMethodOrder(MethodOrderer.DisplayName.class)
    class First {

        @Test
        @DisplayName("b")
        void test() {
        }

        @Test
        @DisplayName("a")
        void test1() {
        }

    }

    /*
     * TODO: create nested class with MethodOrderer.MethodName
     *  and two methods
     */

    @TestMethodOrder(MethodOrderer.MethodName.class)
    @Nested
    class For {

        @Test
        void b() {
        }

        @Test
        void a() {
        }

    }


    /*
     * TODO: create nested class with MethodOrderer.OrderAnnotation
     *  and two methods with @Order
     */

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Second {

        @Test
        @Order(1)
        void test() {
        }

        @Test
        @Order(2)
        void test1() {
        }

    }


    /*
     * TODO: create nested class with MethodOrderer.Random
     *  and two methods
     */

    @Nested
    @TestMethodOrder(MethodOrderer.Random.class)
    class Third {

        @Test
        @DisplayName("b")
        void test() {
        }

        @Test
        @DisplayName("a")
        void test1() {
        }

    }


    /*
     * TODO: create nested class with MethodOrderer.Alphanumeric
     *  and two methods
     */

    @Nested
    @TestMethodOrder(MethodOrderer.Alphanumeric.class)
    class TestClass {

        @Test
        @DisplayName("b")
        void b() {
        }

        @Test
        @DisplayName("a")
        void a() {
        }

    }



    /*
     *   TODO:  create nested class with you custom method orderer with following logic:
     *     if testMethod name contains number than it has higher priority than method without number in name
     */

    @Nested
    @TestMethodOrder(CustomOrder.class)
    class CustomTest {

        @Test
        void test() {

        }

        @Test
        void test2() {

        }
    }

    static class CustomOrder implements MethodOrderer {

        @Override
        public void orderMethods(MethodOrdererContext context) {

            var integers = Set.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            var strings = integers.stream().map(i -> i + "").toList();
            context.getMethodDescriptors()
                    .sort((o1, o2) ->
                            {
                                Predicate<String> containsNumbersO1 = value -> o1.getMethod().getName().contains(value);
                                Predicate<String> containsNumbersO2 = value -> o2.getMethod().getName().contains(value);
                                if (strings.stream().anyMatch(containsNumbersO1)
                                        && strings.stream().anyMatch(containsNumbersO2)) {
                                    return 0;
                                } else if (strings.stream().anyMatch(containsNumbersO1)) {
                                    return -1;
                                } else {
                                    return 1;
                                }
                            }
                    );
        }
    }

    /*
     * TODO: create nested class
     *  and two methods with @Order
     *  don't use MethodOrderer.OrderAnnotation
     *  go to file: resources/junit-platform.properties
     *  remove leading _ from _junit.jupiter.testmethod.order.default
     *  and run test again
     */

    @Nested
    class Tet {
        @Test
        @Order(1)
        void b() {
        }

        @Test
        @Order(2)
        void a() {
        }
    }

}

