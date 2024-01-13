package _7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertyConditionExampleTest {

    @Test
    @EnabledIfSystemProperty(named = "dev-machine", matches = "true")
    void onlyOnDevMachine() {
    }
}
