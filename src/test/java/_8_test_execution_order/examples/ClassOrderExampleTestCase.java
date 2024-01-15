package _8_test_execution_order.examples;

import org.junit.jupiter.api.*;


/**
 * By default, test classes will be ordered using an algorithm
 * that is deterministic but intentionally non-obvious.
 */
public class ClassOrderExampleTestCase {


    /**
     * OrderAnnotation Orderer sorts test classes numerically based on values specified via the @Order annotation
     */
    @Nested
    @TestClassOrder(ClassOrderer.OrderAnnotation.class)
    class OrderAnnotationExample {
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

    @Nested
    @TestClassOrder(ClassOrderer.DisplayName.class)
    class DisplayNameExample {

        @Nested
        @DisplayName("B")
        class First {
            @Test
            void test() {


            }
        }

        @Nested
        @DisplayName("A")
        class Second {
            @Test
            void test() {


            }
        }
    }

    /**
     * ClassName Orderer sorts test classes alphanumerically based on their fully qualified class names
     */
    @Nested
    @TestClassOrder(ClassOrderer.ClassName.class)
    class ClassNameExample {

        @Nested
        class BClass {
            @Test
            void test() {
            }

        }

        @Nested
        class AClass {

            @Test
            void test() {


            }
        }

    }


    /**
     * Random Orderer orders test classes pseudo-randomly
     */
    @Nested
    @TestClassOrder(ClassOrderer.Random.class)
    class RandomExample {

        @Nested
        class Second {
            @Test
            void test() {


            }
        }

        @Nested
        class First {
            @Test
            void test() {


            }
        }

    }


    /**
     * our custom CustomClassOrderer orders test based on name. If name contains First than it starts first
     */
    @Nested
    @TestClassOrder(CustomClassOrderer.class)
    class CustomExample {

        @Nested
        class FirstClass {
            @Test
            void test() {
            }
        }

        @Nested
        class AbcClass {
            @Test
            void test() {
            }
        }


    }


    static class CustomClassOrderer implements ClassOrderer {
        @Override
        public void orderClasses(ClassOrdererContext context) {
            context.getClassDescriptors()
                    .sort((o1, o2) ->
                            {
                                if (o1.getTestClass().getName().contains("First")
                                        && o2.getTestClass().getName().contains("First")) {
                                    return 0;
                                } else if (o1.getTestClass().getName().contains("First")) {
                                    return -1;
                                } else {
                                    return 1;
                                }
                            }
                    );
        }
    }


}
