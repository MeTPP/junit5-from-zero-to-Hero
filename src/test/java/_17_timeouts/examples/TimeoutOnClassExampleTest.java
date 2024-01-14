package _17_timeouts.examples;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(5)
public class TimeoutOnClassExampleTest {

    @Test
    @Timeout(1)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(10_000);
    }

    @Test
    void shouldFailAfterDefaultTimeoutOfFiveSeconds() throws InterruptedException {
        Thread.sleep(10_000);
    }
}
