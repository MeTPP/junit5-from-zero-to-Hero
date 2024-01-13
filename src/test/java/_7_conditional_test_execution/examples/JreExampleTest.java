package _7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JreExampleTest {


    @Test
    @DisabledOnJre(JRE.JAVA_21)
    void test() {
    }
}
