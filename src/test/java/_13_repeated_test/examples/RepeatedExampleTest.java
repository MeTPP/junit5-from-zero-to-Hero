package _13_repeated_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


/**
 * _ @RepeatedTest provides the ability to repeat a test a specified number of times
 */
public class RepeatedExampleTest {

    /**
     * specify the total number of repetitions desired.
     */
    @RepeatedTest(5)
    void repeatTestFiveTimes() {

    }

    /**
     * we can inject repetition info
     */
    @RepeatedTest(5)
    void repeatTestFiveTimesWithInjectedRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo);
    }

    /**
     * we need change required display name for each repetition
     */
    @RepeatedTest(value = 5, name = "attempt {currentRepetition} of total amount: {totalRepetitions}")
    void repeatTestFiveTimesWithCustomName() {

    }

    /**
     * we can specify failure threshold. after it no more repetitions would be executed.
     */
    @RepeatedTest(value = 5, name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER, failureThreshold = 1)
    void repeatTestFiveTimesWithSpecifiedDisplayNamePlaceholderAndFailureThreshold(RepetitionInfo repetitionInfo) {
        // run and check that 3 tests passed, 1 failed and 1 was aborted.
        if (repetitionInfo.getCurrentRepetition() == 4) {
            Assertions.fail();
        }

    }


}
