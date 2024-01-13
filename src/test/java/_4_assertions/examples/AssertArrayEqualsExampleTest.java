package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AssertArrayEqualsExampleTest {


    //todo  add examples
    @Test
    void test() {
        var integers = List.of(1, 2, 3);
        var integersTwo = List.of(3, 2, 1);
        Assertions.assertArrayEquals(integers.toArray(), integersTwo.toArray());
    }

    @Test
    void test1() {
        var integers = List.of(1, 2, 3);
        var integersTwo = List.of(1, 2, 3);
        Assertions.assertArrayEquals(integers.toArray(), integersTwo.toArray());
    }

    @Test
    void test2() {
        var s = new boolean[]{true, false, true};
        var z = new boolean[]{true, false, true};
        Assertions.assertArrayEquals(s, z);
    }
}
