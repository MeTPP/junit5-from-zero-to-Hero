package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

import java.util.Random;

public class CustomConditionPracticeTest {


    /*
     * FIXME: run this test and then fix this test.
     */
    @EnabledIf("myCondition")
    @Test
    void testWithCustomCondition() {

    }


    /*
     * TODO: create test that will be disabled if disabled() is true.
     */
    @EnabledIf("disabled")
    @Test
    void testDisable() {

    }

    /*
     * TODO: create test and you custom condition. Use @EnabledIf to activate test.
     */

    @EnabledIf("returnTrue")
    @Test
    void ourCustomTest() {
    }

    boolean returnTrue() {
        return true;
    }

    boolean myCondition() {
        System.out.println("let's run the test!!!");
        return true;
    }

    boolean disabled() {
        return new Random().nextInt(10) % 2 == 0;
    }

}
