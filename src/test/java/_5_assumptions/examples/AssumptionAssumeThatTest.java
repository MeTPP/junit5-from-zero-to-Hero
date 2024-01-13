package _5_assumptions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionAssumeThatTest {

    @Test
    void assertThat() {
        Assumptions.assumingThat(true, () -> Assertions.assertTrue(true));
        Assumptions.assumingThat(() -> true, () -> Assertions.assertTrue(true));
    }

}
