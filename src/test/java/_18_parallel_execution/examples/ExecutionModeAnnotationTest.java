package _18_parallel_execution.examples;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ExecutionModeAnnotationTest {

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

    @RepeatedTest(2)
    @Execution(ExecutionMode.SAME_THREAD)
    void test3(RepetitionInfo repetitionInfo) throws InterruptedException {
        System.out.printf("test3: repetirion: %d uses %s%n", repetitionInfo.getCurrentRepetition(), Thread.currentThread().getName());
        Thread.sleep(2000);
    }


}
