package _17_timeouts.examples;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(5)
public class TimeoutWithNestedClassExampleTest {
    @Nested
    class NestedClassWithoutTimeout {
        @Test
        void shouldFailAfterParentsDefaultTimeoutOfFiveSeconds() throws InterruptedException {
            Thread.sleep(10_000);
        }
    }

    @Nested
    @Timeout(3)
    class NestedClassWithOverrideTimeout {

        @Test
        void shouldFailAfterNestedClassTimeoutOfThreeSeconds() throws InterruptedException {
            Thread.sleep(10_000);
        }

        @Test
        @Timeout(1)
        void shouldFailAfterOneSecond() throws InterruptedException {
            Thread.sleep(10_000);
        }
    }
}
