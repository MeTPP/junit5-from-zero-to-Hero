package _5_assumptions.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionAbort {


    @Test
    void testAssumptionAbort() {
        Assumptions.abort();
    }

    @Test
    void testAssumptionAbortWithName() {
        Assumptions.abort("just because i can!");
    }

    @Test
    void testAssumptionAbortWithSupplier() {
        Assumptions.abort(() -> "just because i can!");

    }
}
