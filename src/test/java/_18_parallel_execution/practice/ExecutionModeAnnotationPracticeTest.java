package _18_parallel_execution.practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


/**
 * TODO: oh, we don't want wait for 50*1000*3 = 150 sec to execute - find way to end this in a seconds (with one annotation)
 */
@Execution(ExecutionMode.CONCURRENT)
public class ExecutionModeAnnotationPracticeTest {

    private static Long executionTime;

    @BeforeAll
    static void setup() {
        executionTime = System.currentTimeMillis();
    }

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

    /**
     * TODO: change this assertion with one annotation which we learned previously.
     */
    @AfterAll
    static void tearDown() {
        executionTime = System.currentTimeMillis() - executionTime;
        Assertions.assertTrue(executionTime < 60_000);
    }

}
