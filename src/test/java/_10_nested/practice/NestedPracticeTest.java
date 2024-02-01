package _10_nested.practice;

import org.junit.jupiter.api.*;

public class NestedPracticeTest {

    /*
     * TODO: add @BeforeAll method lifecycle to NestedPracticeTest class
     *  create two nested classes:
     *  FirstNestedClass and SecondNestedClass
     *  each class should contain another nested class (ThirdNestedClass and FourthNestedClass)
     *  each class should have @BeforeEach  and @AfterEach lifecycle methods
     */

    @BeforeAll
    static void beforeAll() {

    }

    @Nested
    class FirstNestedClass {

        @BeforeEach
        void setUp() {

        }

        @AfterEach
        void tearDown() {

        }

        @Nested
        class ThirdNestedClass {

            @AfterEach
            void tearDown() {

            }

            @Test
            void test() {


            }

            @BeforeEach
            void setUp() {

            }
        }

    }

    @Nested
    class SecondNEstedClass {


        @BeforeEach
        void setUp() {

        }

        @AfterEach
        void tearDown() {

        }

        @Nested
        class FourthNestedClass {

            @BeforeEach
            void setUp() {

            }

            @Test
            void test() {


            }

            @AfterEach
            void tearDown() {

            }
        }

    }


}
