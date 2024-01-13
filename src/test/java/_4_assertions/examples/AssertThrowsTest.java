package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertThrowsTest {

    @Test
    void assertThrows() {
        Assertions.assertThrows(RuntimeException.class, () -> {
                    throw new RuntimeException();
                }
        );
    }

    @Test
    void assertsThrowsExactly() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            throw new RuntimeException();
        });
    }

    @Test
    void assertDoesnNotThrow() {
        Assertions.assertDoesNotThrow(() -> {
            throw new RuntimeException();
        });
    }
}
