package _5_assumptions.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionBooleanTest {


    /**
     * assumeTrue/assumeFalse - validate the given assumption.
     */
    @Test
    void testAssumeTrueWithBoolean() {
        Assumptions.assumeTrue(true);
        Assumptions.assumeTrue(true, () -> "trueSupplier");
        Assumptions.assumeTrue(true, "true");
    }

    /**
     * do the same but with boolean supplier as a param
     */
    @Test
    void testAssumeTrueWithBooleanSupplier() {
        Assumptions.assumeTrue(() -> true);
        Assumptions.assumeTrue(() -> true, () -> "true");
        Assumptions.assumeTrue(() -> true, "true");
    }


}
