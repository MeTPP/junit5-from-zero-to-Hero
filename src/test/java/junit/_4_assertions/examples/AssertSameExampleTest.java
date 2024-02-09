package junit._4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Assert that the actual object and the unexpected object  are not the same object.
 */
public class AssertSameExampleTest {

    String firstName = "x";
    String secondName = "x";

    @Test
    void assertAssertNotSame() {
        Assertions.assertNotSame(firstName, secondName);
    }

    @Test
    void testAssertNotSameWithStringMessage() {
        Assertions.assertNotSame(firstName, secondName, "should not be same ");
    }

    @Test
    void testAssertNotSameWithMessageSupplier() {
        Assertions.assertNotSame(firstName, secondName, () -> "should not be same ");
    }
}
