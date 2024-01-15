package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * simple check that actual value is null or is not null.
 */
public class AssertNullAndNotNullExampleTest {

    String name = null;
    String secondName = "";

    @Test
    void testAssertNull() {
        Assertions.assertNull(name);
    }

    @Test
    void testAssertNullWithMessage() {
        Assertions.assertNull(name, "should be null");
    }

    @Test
    void testAssertNullWithMessageSupplier() {
        Assertions.assertNull(name, () -> "should  be null");
    }

    @Test
    void testAssertNotNull() {
        Assertions.assertNotNull(secondName);
    }

    @Test
    void testAssertNotNullWithMessage() {
        Assertions.assertNotNull(secondName, "should not be null");
    }

    @Test
    void testAssertNotNullWithMessageSupplier() {
        Assertions.assertNotNull(secondName, () -> "should not be null");
    }

}
