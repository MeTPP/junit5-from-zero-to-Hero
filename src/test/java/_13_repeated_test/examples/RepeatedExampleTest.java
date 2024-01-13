package _13_repeated_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedExampleTest {

    @RepeatedTest(5)
    void repeatTestFiveTimes() {

    }

    @RepeatedTest(5)
    void repeatTestFiveTimesWithInjectedRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo);
    }

    @RepeatedTest(value = 5, name = "attempt {currentRepetition} of total amount: {totalRepetitions}")
    void repeatTestFiveTimesWithCustomName() {

    }

    @RepeatedTest(value = 5, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER, failureThreshold = 1)
    void repeatTestFiveTimesWithSpecifiedDisplayNamePlaceholderAndFailureThreshold(RepetitionInfo repetitionInfo) {
        // run and check that 3 tests passed, 1 failed and 1 was aborted.
        if (repetitionInfo.getCurrentRepetition() == 4) {
            Assertions.fail();
        }

    }


}
