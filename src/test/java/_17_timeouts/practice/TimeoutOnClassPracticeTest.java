package _17_timeouts.practice;

import org.junit.jupiter.api.Test;


/**
 * TODO: both of this test method should fail if executes more then 2 secs. do it with one annotation
 */
public class TimeoutOnClassPracticeTest {

    @Test
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(2_024);
    }

    @Test
    void shouldFailAfterOneSecondAnother() throws InterruptedException {
        Thread.sleep(2_024);
    }

}
