package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OsConditionPracticeTest {

    /*
     * FIXME: should be enabled on windows
     */
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnLinux() {

    }

    /*
     * TODO: write test that will we disabled on your OS
     */
    @DisabledOnOs(OS.MAC)
    @Test
    void test() {
    }


    /*
     * TODO: write test that will run only on your OS
     */
    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMAc() {

    }

    /*
     * TODO: write test that will be disabled on FREEBSD OS
     */
    @Test
    @DisabledOnOs(OS.FREEBSD)
    void test1(){}

}
