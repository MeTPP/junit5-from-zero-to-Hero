package _11_dependency_injection.practice;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


public class RepetitionInfoPracticeTest {

    /*
     * TODO: create constructor that will print failureThreshold
     *  hint: use RepetitionInfo
     */

    public RepetitionInfoPracticeTest(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getFailureThreshold());
    }

    /*
     *   TODO: write repeat test that will run 5 times
     *     using System.out print each current number of invocation
     */
    @RepeatedTest(5)
    void test(RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition());

    }


}
