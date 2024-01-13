package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class AssertTimeoutsExampleTest {

    // todo add timeouts
    @Test
    void test() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(100));
    }


}
