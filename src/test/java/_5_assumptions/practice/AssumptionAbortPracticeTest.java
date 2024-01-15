package _5_assumptions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class AssumptionAbortPracticeTest {


    /*
     * TODO: create test that will abort
     */

    @Test
    void testAbort() {
        Assumptions.abort();

    }

    /*
     * TODO: create test that will abort and will supply abort reason as a string
     */
    @Test
    void testAbortWithString() {

        Assumptions.abort("just because");

    }

    /*
     * TODO: create test that will abort and will supply abort reason as a message supplier
     */

    @Test
    void testWithMessageSupplier() {
        Assumptions.abort(() -> "just because");

    }

    /*
     * TODO: abort test if current day monday or friday
     */
    @Test
    void abortIfCurrentDayIsMondayOrFriday() {
        if (List.of(DayOfWeek.MONDAY, DayOfWeek.FRIDAY).contains(LocalDate.now().getDayOfWeek())) {
            Assumptions.abort();
        }
        Assertions.assertTrue(true);
    }

}
