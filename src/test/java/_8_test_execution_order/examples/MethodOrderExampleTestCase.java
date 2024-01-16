package _8_test_execution_order.examples;

import org.junit.jupiter.api.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * By default, test methods will be ordered using an algorithm
 * that is deterministic but intentionally non-obvious.
 */
public class MethodOrderExampleTestCase {


    /**
     * to control order in which test methods are executed
     * = annotate your method @TestMethodOrder +  specify  MethodOrdered
     * Random Method Orderer orders test methods pseudo-randomly
     */
    @Nested
    @TestMethodOrder(MethodOrderer.Random.class)
    class RandomMethodOrder {
        @Test
        void test1() {
        }

        @Test
        void test2() {
        }
    }

    /**
     * OrderAnnotation sorts test methods numerically based on @Order annotation
     */
    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class OrderAnnotationMethodOrder {

        @Test
        @Order(3)
        void a_test() {
        }

        @Test
        @Order(1)
        void b_test() {
        }

        @Test
        @Order(2)
        void c_test() {
        }
    }


    /**
     * MethodName sorts test methods alphanumerically based on their names
     */
    @Nested
    @TestMethodOrder(MethodOrderer.MethodName.class)
    class MethodNameAnnotationMethodOrder {

        @Test
        void c_test() {
        }

        @Test
        void b_test() {
        }

        @Test
        void a_test() {
        }


    }

    /**
     * DisplayName sorts test methods alphanumerically based on their display names
     */
    @Nested
    @TestMethodOrder(MethodOrderer.DisplayName.class)
    class DisplayAnnotationMethodOrder {

        @Test
        @DisplayName("1_let_me_be_the_first")
        void c_test() {
        }

        @Test
        @DisplayName("3_let_me_be_the_last_one")
        void b_test() {
        }


        @Test
        @DisplayName("2_let_me_be_the_second")
        void a_test() {
        }


    }

    /**
     * sorts test methods alphanumerically based on their names but deprecated
     * use MethodName Orderer instead
     */
    @Nested
    @TestMethodOrder(MethodOrderer.Alphanumeric.class)
    class AlphanumericAnnotationMethodOrder {

        @Test
        void c_test() {
        }

        @Test
        void b_test() {
        }

        @Test
        void a_test() {
        }


    }


    /**
     * Custom - you can provide your own logic
     */
    @Nested
    @TestMethodOrder(CustomMethodOrderer.class)
    class CustomAnnotationMethodOrder {

        @Test
        void a_test() {
        }

        @Test
        void b_test() {
        }

        @Test
        @Custom
        void c_test() {
        }


    }

}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom {
}

/**
 * first we run methods with @Custom annotation
 */
class CustomMethodOrderer implements MethodOrderer {
    @Override
    public void orderMethods(MethodOrdererContext context) {
        context.getMethodDescriptors()
                .sort((o1, o2) ->
                        {
                            if (o1.isAnnotated(Custom.class) && (o2.isAnnotated(Custom.class))) {
                                return 0;
                            } else if (o1.isAnnotated(Custom.class)) {
                                return -1;
                            } else {
                                return 1;
                            }
                        }
                );
    }

}

