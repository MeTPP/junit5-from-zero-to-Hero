package _7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

public class CustomConditionExampleTest {

    @EnabledIf("myCondition")
    @Test
    void test() {

    }

    boolean myCondition(){
        return true;
    }
}
