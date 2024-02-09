package junit._7_conditional_test_execution.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;


/**
 * A container or test may be enabled
 * or disabled on particular versions of the Java Runtime Environment (JRE)
 */
public class JreExampleTest {

    @Test
    @DisabledOnJre(JRE.JAVA_21)
    void disableOnJava21() {
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_21})
    void enableOnJava8And21() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_21)
    void disableOnRangeFrom8to21() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_15, disabledReason = "new class structure")
    void disableFromJava15() {

    }

    @Test
    @DisabledForJreRange(max = JRE.JAVA_9, disabledReason = "new module system")
    void disableToJava9() {

    }
}



