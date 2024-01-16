package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JrePracticeTest {

    /*
     * TODO: write test that will run on your JRE only
     */

    @EnabledOnJre(JRE.JAVA_21)
    @Test
    void test() {

    }

    /*
     * TODO: write test that will run on JRE from 8 to 15
     */
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_15)
    @Test
    void test2() {
    }

    /*
     * TODO: write test that will be disabled on JRE 8
     */
    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void test3(){

    }

    /*
     * TODO: write test that will be disabled on your JRE
     */

    @DisabledOnJre(JRE.JAVA_21)
    @Test
    void test4(){}


}
