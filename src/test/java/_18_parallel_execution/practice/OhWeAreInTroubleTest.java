package _18_parallel_execution.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


// oh we don't want w8 50*1000*3 = 150 sec to execute - find way to end this in
// a seconds
@Execution(ExecutionMode.CONCURRENT)
public class OhWeAreInTroubleTest {


    @RepeatedTest(50)
    void test(RepetitionInfo repetitionInfo) throws InterruptedException {
        Thread.sleep(1000);
        Assertions.assertEquals(50, repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(50)
    void test1(RepetitionInfo repetitionInfo) throws InterruptedException {
        Thread.sleep(1000);
        Assertions.assertEquals(50, repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(50)
    void test3(RepetitionInfo repetitionInfo) throws InterruptedException {
        Thread.sleep(1000);
        Assertions.assertEquals(50, repetitionInfo.getTotalRepetitions());
    }

}
