package _5_assumptions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class AssumptionAbortPracticeTest {


    /*
     * TODO: create test that will abort
     */

    /*
     * TODO: create test that will abort and will supply abort reason as a string
     */

    /*
     * TODO: create test that will abort and will supply abort reason as a message supplier
     */

    /*
     * TODO: abort test if current day monday or friday
     */
    @Test
    void abortIfCurrentDayIsMondayOrFriday() {
        if (List.of(DayOfWeek.MONDAY, DayOfWeek.FRIDAY).contains(LocalDate.now().getDayOfWeek())) {

        }
        Assertions.assertTrue(true);
    }

}
