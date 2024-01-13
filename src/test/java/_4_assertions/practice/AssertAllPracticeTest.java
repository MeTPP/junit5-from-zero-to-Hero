package _4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class AssertAllPracticeTest {


    @Test
    void assertAllWithHeading() {
        // add heading to assertion
        Assertions.assertAll(() -> Assertions.assertTrue(true));
    }

    //combine two assertion
    //Assertions.assertTrue(true) and Assertions.assertFalse(false) with assertAll
    @Test
    void assertAll() {
        Assertions.assertAll();
    }


    // group these assertions under one assertAll
    @Test
    void fixAssertAll() {
        Assertions.assertAll(Stream.of(() -> Assertions.assertTrue(true)));
        Assertions.assertTrue(false);
        Assertions.assertTrue(4 > 5);
        Assertions.assertEquals(3, "hello".length());
    }


}
