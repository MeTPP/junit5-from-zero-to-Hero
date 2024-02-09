package junit._18_parallel_execution.examples;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;


/**
 * The @Execution annotation is used to configure the execution mode of the test methods within a test class in JUnit 5.
 * JUnit 5 supports two modes of execution: SAME_THREAD and CONCURRENT.
 * to enable parallel execution you need to set junit.jupiter.execution.parallel.enabled=true
 * in resources/junit-platform.properties
 */
@Execution(ExecutionMode.CONCURRENT)
public class ExecutionModeAnnotationTest {


    /**
     * CONCURRENT: With CONCURRENT execution mode, test methods are executed in different threads
     * which allows for parallel execution.
     * This mode is beneficial for speeding up the overall test execution time,
     * especially for tests that are independent of each other and do not share state.
     */
    @Execution(ExecutionMode.CONCURRENT)
    @Test
    void test0() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Test
    void test1() throws InterruptedException {
        System.out.println("test1 uses " + Thread.currentThread().getName());
        Thread.sleep(2000);
    }

    @Test
    void test2() throws InterruptedException {
        System.out.println("test1 uses " + Thread.currentThread().getName());
        Thread.sleep(2000);
    }

    /**
     * SAME_THREAD: When tests are executed with the SAME_THREAD mode,
     * all test methods in the test class are run in the same thread.
     * This mode is useful when you need to ensure that the test methods are not executed concurrently,
     * for instance, when they share state that is not thread-safe.
     */
    @RepeatedTest(2)
    @Execution(ExecutionMode.SAME_THREAD)
    void test3(RepetitionInfo repetitionInfo) throws InterruptedException {
        System.out.printf("test3: repetition: %d uses %s%n", repetitionInfo.getCurrentRepetition(), Thread.currentThread().getName());
        Thread.sleep(2000);
    }


}
