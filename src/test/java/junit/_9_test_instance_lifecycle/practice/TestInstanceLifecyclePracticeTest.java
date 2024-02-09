package junit._9_test_instance_lifecycle.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(10, list.size());
    }

    /**
     * FIXME: fix this test(by changing expected value in assertion) and explain why
     */
    @Test
    void test2() {
        list.add("s");
        Assertions.assertEquals(10, list.size());
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

    /*
     * TODO: write  method that will print "Hello, JUnit 5 Hero!" before each test
     */

    /*
     * TODO: write method that will print "It was great test, JUnit 5 Hero!" before each test
     */

    /*
     * TODO: write method that will print "Bye-bye, JUnit 5 Hero!" in console only ONE time after all tests
     */


    /*
     *  TODO: write 2 test to prove that previous task works.
     */

    /*
     * TODO: remove _ before _junit.jupiter.testinstance.lifecycle.default
     *  and check what will happen with test instances using System.out.println(this)
     */

}
