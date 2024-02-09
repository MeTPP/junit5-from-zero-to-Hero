package junit._4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Assert that execution of the supplied
 * executable throws and return the exception of the expectedType
 */
public class AssertThrowsTest {

    @Test
    void testAssertThrows() {
        Assertions.assertThrows(RuntimeException.class, () -> {
                    throw new RuntimeException();
                }
        );
    }

    @Test
    void testAssertsThrowsExactly() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            throw new RuntimeException();
        });
    }

    @Test
    void testAssertDoesntNotThrow() {
        Assertions.assertDoesNotThrow(() -> {
            throw new RuntimeException();
        });
    }
}
