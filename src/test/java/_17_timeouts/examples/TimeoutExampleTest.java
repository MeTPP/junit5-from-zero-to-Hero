package _17_timeouts.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutExampleTest {

    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(2_000);
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
