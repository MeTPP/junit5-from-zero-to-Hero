package junit._4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * An assertion is a statement or a piece of code that checks whether a given condition is true or false.
 */
public class AssertAllTest {

    /**
     * AssertAll - assert that all supplied executables do not throw exceptions
     * it can be helpful when you need to assert some assertions and to avoid situation
     * when one assertion fails and others don't even started. In this case you need to run tests again and again..
     * you can specify heading in assertAll statement.
     */
    @Test
    void testAssertAllWithHeading() {
        Assertions.assertAll(
                "this is group name",
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(false)
        );
    }

    /**
     * but you can pass only varargs of executables.
     */
    @Test
    void assertAllWithoutHeading() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(false)
        );
    }

    /**
     * same as set
     */
    @Test
    void assertAllWithSetAndHeading() {
        Assertions.assertAll(
                "group name with executable collection",
                Set.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }

    /**
     * same as Stream
     */
    @Test
    void assertAllWithStreamAndHeading() {
        Assertions.assertAll(
                "group name with executable stream",
                Stream.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }


    /**
     * you can omit heading
     */
    @Test
    void assertAllWithStreamWithoutHeading() {
        Assertions.assertAll(
                Stream.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }


    /**
     * you can use list as well
     */
    @Test
    void assertAllWithListWithoutHeading() {
        Assertions.assertAll(
                List.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }
}
