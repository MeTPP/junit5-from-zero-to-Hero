package _7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

/**
 * test may be enabled or disabled based on a condition method configured
 */
public class CustomConditionExampleTest {

    @EnabledIf("myCondition")
    @Test
    void testEnableIf() {

    }

    @DisabledIf("myCondition")
    @Test
    void testDisabledIf() {
    }

    boolean myCondition() {
        return true;
    }
}
