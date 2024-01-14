package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * assertArrayEquals - assert that expected and actual object arrays are deeply equal.
 */
public class AssertArrayEqualsExampleTest {

    /**
     * arrays with different order are not the same
     * you can check it with assertArrayEquals
     */
    @Test
    void testArraysWithDifferentOrder() {
        var integers = List.of(1, 2, 3);
        var integersTwo = List.of(3, 2, 1);
        Assertions.assertArrayEquals(integers.toArray(), integersTwo.toArray());
    }

    /**
     * arrays with same order are equals.
     */
    @Test
    void testArraysWithSameOrder() {
        var integers = List.of(1, 2, 3);
        var integersTwo = List.of(1, 2, 3);
        Assertions.assertArrayEquals(integers.toArray(), integersTwo.toArray());
    }

    /**
     * you can check different types of arrays.
     */
    @Test
    void testBooleanArray() {
        var firstBooleanList = new boolean[]{true, false, true};
        var secondBooleanList = new boolean[]{true, false, true};
        Assertions.assertArrayEquals(firstBooleanList, secondBooleanList);
    }
}
