package junit._4_assertions.practice;

import org.junit.jupiter.api.Test;

import java.util.List;

public class AssertArrayEqualsPracticeTest {

    /**
     * TODO: assert arrays equals
     */
    @Test
    void assertArraysEquals() {
        var list1 = List.of(12, 13, 14);
        var list2 = List.of(12, 13, 14);
    }

    /**
     * TODO: assert arrays not equals
     */
    @Test
    void assertArraysAreNotEquals() {
        var list1 = List.of(12, 14, 14);
        var list2 = List.of(12, 13, 14);
    }

}
