package _16_dynamic_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class DynamicTestPracticeTestCase {


    @Nested
    class StringManipulationTest {

        /**
         * TODO: Implement dynamic tests for different string manipulation methods
         *  You could test methods like reversing a string, converting to uppercase, etc.
         */
        @TestFactory
        Stream<DynamicTest> stringManipulationTests() {
            return Stream.empty();
        }
    }

    @Nested
    class ArrayLengthTest {

        /**
         * FIXME: make test green
         */
        @TestFactory
        Stream<DynamicTest> checkArrayLengths() {
            Object[][] testData = {
                    {new int[]{1, 2, 3}, 5},
                    {new int[]{4, 5}, 12},
                    {new int[]{6, 7, 8, 9}, 3}
            };
            return Stream.of(testData).map(array -> DynamicTest.dynamicTest(
                    "Array with length " + (int) array[1],
                    () -> Assertions.assertEquals((int) array[1], ((int[]) array[0]).length)
            ));
        }
    }


}
