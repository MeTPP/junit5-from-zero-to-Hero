package _14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourcePracticeTest {

    @Nested
    class ArithmeticTest {

        /**
         * TODO: Implement this test to validate the addition of two numbers
         *  The CSV file '/arithmeticData.csv' should contain rows of data in the format: a, b, expectedSum
         */
        @ParameterizedTest
        @CsvFileSource(resources = "/arithmeticData.csv")
        void testAddition(int a, int b, int expectedSum) {
            Assertions.assertEquals(expectedSum, a + b);
        }
    }

    @Nested
    class StringManipulationTest {

        /**
         * TODO: Implement this test to check the conversion of strings to uppercase
         *         The CSV file '/stringData.csv' should contain rows of data in the format: input, expectedOutput
         */
        @ParameterizedTest
        @CsvFileSource(resources = "/stringData.csv")
        void testToUpperCase(String input, String expectedOutput) {
            Assertions.assertEquals(expectedOutput, input.toUpperCase());

        }
    }

    @Nested
    class UserValidationTest {

        /**
         * TODO: Implement this test to validate different user instances
         *  The CSV file '/userData.csv' should contain rows in the format: username, age, isValid
         */
        @ParameterizedTest
        @CsvFileSource(resources = "/userData.csv", numLinesToSkip = 1)
        void testUserValidation(String username, Integer age, boolean isValid) {
            Assertions.assertEquals(age != null, isValid);
        }
    }


    /**
     * FIXME: don't modify test implementation. change data (missingData.csv) to make test green
     */
    @Nested
    class MissingDataTest {

        @ParameterizedTest
        @CsvFileSource(resources = "/missingData.csv", nullValues = {"-", "space"})
        void testWithMissingData(String name, Integer age) {
            Assertions.assertAll(
                    () -> Assertions.assertNotNull(name),
                    () -> Assertions.assertNotNull(age)
            );
        }
    }

}
