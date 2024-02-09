package _17_timeouts.practice;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

/**
 * FIXME: make tests green
 */
@Timeout(1)
public class TimeoutWithNestedClassPracticeTest {


    @Nested
    @Execution(ExecutionMode.CONCURRENT)
    class canRunMoreThan1Second {

        @Test
        void sleep2Sec1() throws InterruptedException {
            Thread.sleep(2000);
        }

        @Test
        void sleep2Sec2() throws InterruptedException {
            Thread.sleep(2000);
        }

        @Test
        void sleep2Sec3() throws InterruptedException {
            Thread.sleep(2000);
        }

        @Test
        void sleep2Sec4() throws InterruptedException {
            Thread.sleep(2000);
        }

        @Test
        void sleep2Sec5() throws InterruptedException {
            Thread.sleep(2000);
        }

    }
}
