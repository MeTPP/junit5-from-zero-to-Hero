package _4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class AssertArrayEqualsPracticeTest {

    /**
     * TODO: assert arrays equals
     */
    @Test
    void assertArraysEquals() {
        var list1 = List.of(12, 13, 14);
        var list2 = List.of(12, 13, 14);

        Assertions.assertArrayEquals(list1.toArray(), list2.toArray());

    }

    /**
     * TODO: assert arrays not equals
     */
    @Test
    void assertArraysAreNotEquals() {


        var list1 = List.of(12, 14, 14);
        var list2 = List.of(12, 13, 14);

        IntStream.range(0, list1.size())
                .skip(2)
                .forEachOrdered(i -> Assertions.assertEquals(list1.get(i), list2.get(i)));

        Assertions.assertNotEquals(list1.get(1), list2.get(1));
    }

}
