package _1_test.practice;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class CreateYourFirstTests {

    /*
     * TODO: create test that fails aka red.
     */
    @Test
    void failedTest(){
        throw new RuntimeException("boom!");
    }

    /*
     * TODO: create test that passes successfully aka green.
     */
    @Test
    void greenTest(){

    }

    /*
     * TODO: create test that aborts aka grey.
     */

    @Test
    void greyTest(){
        Assumptions.abort("hey!");
    }

}
