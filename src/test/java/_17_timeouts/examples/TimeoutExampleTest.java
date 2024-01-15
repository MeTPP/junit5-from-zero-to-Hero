package _17_timeouts.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Timeout annotation is used to define a timeout for a method or all testable methods
 */
public class TimeoutExampleTest {

    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(2_024);
    }

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
