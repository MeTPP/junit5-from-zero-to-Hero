package _17_timeouts.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


/**
 * TODO: both of this test method should fail if executes more then 2 secs. do it with one annotation
 */
@Timeout(2)
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
