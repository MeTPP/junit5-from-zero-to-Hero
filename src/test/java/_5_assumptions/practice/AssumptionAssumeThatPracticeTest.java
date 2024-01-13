package _5_assumptions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionAssumeThatPracticeTest {

    /**
     * FIXME: change condition to see "should be true" in output.
     */
    @Test
    void test() {
        Assumptions.assumingThat(3 > 4, () -> Assertions.assertTrue(false, "should be true"));
    }

    /*
     * TODO: write test using Assumption.assumingThat with boolean as a first argument
     */

    /*
     * TODO: write test using Assumption.assumingThat with booleanSupplier as a first argument
     */
}
