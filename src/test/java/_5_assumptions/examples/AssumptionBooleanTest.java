package _5_assumptions.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionBooleanTest {


    @Test
    void assumeTrue() {
        // boolean
        Assumptions.assumeTrue(true);
        Assumptions.assumeTrue(true, () -> "trueSupplier");
        Assumptions.assumeTrue(true, "true");

        // booleanSupplier
        Assumptions.assumeTrue(() -> true);
        Assumptions.assumeTrue(() -> true, () -> "true");
        Assumptions.assumeTrue(() -> true, "true");
    }


}
