package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OsConditionPracticeTest {

    /*
     * FIXME: should be enabled on windows
     */
    @EnabledOnOs(OS.SOLARIS)
    @Test
    void testOnLinux() {

    }

    /*
     * TODO: write test that will we disabled on your OS
     */

    /*
     * TODO: write test that will run only on your OS
     */

    /*
     * TODO: write test that will be disabled on FREEBSD OS
     */


}
