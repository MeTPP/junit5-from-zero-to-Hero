package _9_test_instance_lifecycle.practice;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class TestInstanceLifecyclePracticeTest {


    private List<String> list = new ArrayList<>();


    /**
     * FIXME: fix this test (by changing expected value in assertion)
     */
    @Test
    void test1() {
        list.add("s");
        list.add("s");
        Assertions.assertEquals(2, list.size());
    }

    /**
     * FIXME: fix this test(by changing expected value in assertion) and explain why
     */
    @Test
    void test2() {
        list.add("s");
        Assertions.assertEquals(1, list.size());
    }


    /*
     *
     *    TODO: write lifecycle method that will print this car in console only ONE time before all methods
     *      ──────▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌
     *      ───▄▄██▌█ BEEP BEEP
     *      ▄▄▄▌▐██▌█  DELIVERY
     *      ███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌
     *      ▀(⊙)▀▀▀▀▀▀▀(⊙)(⊙)▀▀▀▀▀▀▀▀▀▀(⊙
     */

    @BeforeAll
    static void beforeAll() {
        System.out.println(
                """
                             *      ──────▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▌
                             *      ───▄▄██▌█ BEEP BEEP
                             *      ▄▄▄▌▐██▌█  DELIVERY
                             *      ███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▌
                             *      ▀(⊙)▀▀▀▀▀▀▀(⊙)(⊙)▀▀▀▀▀▀▀▀▀▀(⊙
                                                
                                                
                        """
        );
    }

    /*
     * TODO: write  method that will print "Hello, JUnit 5 Hero!" before each test
     */

    @BeforeEach
    void setUp() {
        System.out.println("Hello, JUnit 5 Hero!");
    }

    /*
     * TODO: write method that will print "It was great test, JUnit 5 Hero!" after each test
     */

    @AfterEach
    void tearDown() {
        System.out.println("It was great test, JUnit 5 Hero!");
    }

    /*
     * TODO: write method that will print "Bye-bye, JUnit 5 Hero!" in console only ONE time after all tests
     */

    @AfterAll
    static void afterAll() {
        System.out.println("Bye-bye, JUnit 5 Hero!");
    }

    @Test
    void test() {
        System.out.println(this);

    }

    @Test
    void test12() {
        System.out.println(this);

    }
    /*
     *  TODO: write 2 test to prove that previous task works.
     */

    /*
     * TODO: remove _ before _junit.jupiter.testinstance.lifecycle.default
     *  and check what will happen with test instances using System.out.println(this)
     */

}
