package _17_timeouts.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * This annotation is used to specify that a test method or test class must finish its execution within a specified time period.
 * If the execution time exceeds the specified timeout, the test is marked as failed.
 * Usage: It can be applied at both the method and class level.
 * When applied at the class level, it applies to all test methods within that class.
 */
@Timeout(5)
public class TimeoutExampleTest {

    /**
     * {@code @Timeout} sets a maximum time limit for the execution of a test method or all methods in a test class.
     * If the time limit is exceeded, the test is automatically failed.
     */
    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(2_024);
    }


    /**
     * The timeout value is specified along with its time unit, such as seconds, minutes, etc.
     */
    @Test
    @Timeout(value = 2, unit = TimeUnit.MINUTES)
    void shouldFailAfterTwoMinutes() {
        System.out.println(Thread.currentThread().getName());
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.MINUTES, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    void shouldUseSeparateThread() {
        System.out.println(Thread.currentThread().getName());
    }


}
