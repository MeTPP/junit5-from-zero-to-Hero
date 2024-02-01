package _13_repeated_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedPracticeTest {

    /**
     * TODO: write repeated test that will launch 3 times
     */
    @RepeatedTest(3)
    void testThatRepeats3Times() {

    }

    /**
     * TODO: write repeated test with following display pattern:
     *  <b>right now I am executing repetition number i</b>
     *  where i is current repetition number
     */
    @RepeatedTest(value = 3, name = "right now I am executing repetition number {currentRepetition}")
    void testWithDisplayPatter() {
    }


    /*
     * FIXME: change method. it should abort execution if 2 exceptions already happened
     */
    @RepeatedTest(value = 10, failureThreshold = 2)
    void test(RepetitionInfo repetitionInfo) {
        if (repetitionInfo.getCurrentRepetition() % 2 == 0) {
            Assertions.fail();
        }
    }


}
