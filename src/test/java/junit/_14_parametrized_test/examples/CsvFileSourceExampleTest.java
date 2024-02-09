package junit._14_parametrized_test.examples;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * {@code @CsvFileSource} used in parameterized tests to specify an external CSV file as the source of parameters.
 * It's ideal for cases where the test data is too extensive or complex to be conveniently included directly in the code,
 * allowing you to maintain a clean and readable test suite.
 */
public class CsvFileSourceExampleTest {

    @Nested
    class CalculatorTests {


        /**
         * The annotation links to CSV files containing the test data.
         * These files should be located in the resources directory of your project.
         * check src/test/resources/data.csv
         * Similar to @CsvSource, @CsvFileSource supports passing multiple parameters to the test method,
         * with each column in the CSV file corresponding to a different parameter.
         */
        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        void testAdd(int a, int b, int sum) {
            assertEquals(sum, a + b);
        }

        @Nested
        class UserTest {

            /**
             * JUnit automatically converts the string values from the CSV file
             * to the appropriate types for the test method parameters.
             */
            @ParameterizedTest
            @CsvFileSource(resources = "/userData.csv", numLinesToSkip = 1)
            void testUserValidity(String name, Integer age, boolean isValid) {
                User user = new User(name, age);
                assertEquals(isValid, isValid(user));
            }

            private boolean isValid(User user) {
                return user.age != null;
            }

            private record User(String name, Integer age) {
            }
        }

        @Nested
        class StringTests {

            /**
             * You can configure the delimiter used in the CSV file (default is comma),
             * and also specify if the first line is a header that should be skipped.
             */
            @ParameterizedTest
            @CsvFileSource(resources = "/dataSemicolon.csv", numLinesToSkip = 1, delimiterString = ";")
            void testStringLength(String input, int expectedLength) {
                assertEquals(expectedLength, input.length());
            }
        }

    }

}
