package _7_conditional_test_execution.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyConditionPracticeTest {

    @BeforeAll
    static void beforeAll() {
        System.setProperty("mood", "sad");
        System.setProperty("rocket_enabled", "true");
        System.setProperty("ready_to_launch", "true");
    }

    /*
     * TODO: write test that will be disabled if system property "mood" set to "sad"
     */
    @EnabledIfSystemProperty(named = "mood", matches = "sad")
    @Test
    void test() {

    }

    /*
     * TODO: write test that will run if check two system properties with names "rocket_enabled"
     *  and "ready_to_launch" set to true
     */

    @EnabledIfSystemProperty(named = "rocket_enabled", matches = "true")
    @EnabledIfSystemProperty(named = "ready_to_launch", matches = "true")
    @Test
    void testLaunch() {

    }

}
