package _4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;


public class AssertTimeoutsPracticeTest {

    /**
     * FIXME: make this test green. use different methods. all that you can imagine.
     */
    @Test
    void test() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(1100));
    }


}
