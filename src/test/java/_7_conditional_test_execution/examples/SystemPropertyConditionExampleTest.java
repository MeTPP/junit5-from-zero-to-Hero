package _7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

/**
 * test may be enabled or disabled based on the value of the named JVM system property
 */
public class SystemPropertyConditionExampleTest {

    @Test
    @EnabledIfSystemProperty(named = "dev-machine", matches = "true")
    void onlyOnDevMachine() {
    }

    @Test
    @DisabledIfSystemProperty(named = "dev-machine", matches = "true")
    void onlyOnRemoteServer() {
    }
}
