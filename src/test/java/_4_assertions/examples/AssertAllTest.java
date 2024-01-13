package _4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class AssertAllTest {

    @Test
    void test() {
        Assertions.assertAll(
                "this is group name",
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(false)
        );
    }

    @Test
    void test1() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(false)
        );
    }

    @Test
    void test2() {
        Assertions.assertAll(
                "group name with executable collection",
                Set.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }

    @Test
    void test3() {
        Assertions.assertAll(
                "group name with executable stream",
                Stream.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }

    @Test
    void test4() {
        Assertions.assertAll(
                Stream.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }


    @Test
    void test5() {
        Assertions.assertAll(
                List.of(
                        () -> Assertions.assertTrue(true),
                        () -> Assertions.assertFalse(false))
        );
    }


}
