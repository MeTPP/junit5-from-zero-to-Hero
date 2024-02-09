package junit._7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;

/**
 * test may be enabled or disabled based
 * on the value of the named environment variable from the underlying operating system
 */
public class EnvironmentVariableConditionExampleTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "env", matches = ".*dev")
    void onlyOnDevMachine() {
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "env", matches = ".*dev")
    void onlyOnRemoteMachine() {
    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "env", matches = ".*dev"),
            @EnabledIfEnvironmentVariable(named = "status", matches = "ready")
    })
    void enabledIfPassedAsArray() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "env", matches = ".*dev")
    @EnabledIfEnvironmentVariable(named = "status", matches = "ready")
    void enabledIfPassedAsRepeatableAnnotations() {
    }
}
