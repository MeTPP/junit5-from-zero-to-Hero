package junit._5_assumptions.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 * Assumptions is a collection
 * of utility methods that support conditional test execution based on assumptions.
 */
public class AssumptionAbortTest {


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
