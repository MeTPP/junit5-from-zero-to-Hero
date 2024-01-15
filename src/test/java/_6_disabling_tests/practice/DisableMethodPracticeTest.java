package _6_disabling_tests.practice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodPracticeTest {

    /*
     * TODO: write test that will pass successfully
     */
    @Test
    void test() {

    }

    /*
     * TODO: write test that will fail
     */
    @Test
    @Disabled
    void test1() {

        throw new RuntimeException();

    }

    /*
     * TODO: disable red test
     */

}
