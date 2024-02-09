package junit._17_timeouts.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutPracticeTest {

    /**
     * FIXME: make test green. you cannot remove timeout annotation
     */
    @Timeout(value = 1)
    @Test
    void test() throws InterruptedException {
        Thread.sleep(1100);
    }


}
