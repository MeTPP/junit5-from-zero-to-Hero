package junit._4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.time.Duration;

/**
 * Assert that execution of supplied logic completes before the given timeout is exceeded
 */
public class AssertTimeoutsExampleTest {

    @Test
    void testAssertTimeout() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(100));
    }

    @Test
    void testAssertTimeoutWithMessage() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(100), "should run less than second");
    }

    @Test
    void testAssertTimeoutWithMessageSupplier() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(100), () -> "should run less than second");
    }


    @Test
    void testAssertTimeoutWithMessageSupplierWithThrowingSupplier() {
        ThrowingSupplier<Object> throwingSupplier = () -> {
            Thread.sleep(100);
            throw new RuntimeException();
        };
        Assertions.assertTimeout(Duration.ofSeconds(1), throwingSupplier, () -> "should run less than second");
    }

    @Test
    void testAssertTimeoutWithMessageWithThrowingSupplier() {
        ThrowingSupplier<Object> throwingSupplier = () -> {
            Thread.sleep(100);
            throw new RuntimeException();
        };
        Assertions.assertTimeout(Duration.ofSeconds(1), throwingSupplier, "should run less than second");
    }

    @Test
    void testAssertTimeoutWithThrowingSupplier() {
        ThrowingSupplier<Object> throwingSupplier = () -> {
            Thread.sleep(100);
            throw new RuntimeException();
        };
        Assertions.assertTimeout(Duration.ofSeconds(1), throwingSupplier);
    }


}
