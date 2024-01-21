package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * CsvSource used in parameterized tests to specify comma-separated values as the source of parameters.
 * It's highly effective for supplying a series of complex arguments
 * in a readable and concise manner directly within your test code.
 */
public class CsvSourceExampleTest {

    /**
     * Data is defined in a comma-separated format,
     * where each set of values represents a different invocation of the parameterized test.
     */
    @ParameterizedTest
    @CsvSource(value = {
            "1,2,3",
            "4,5,6",
    })
    void test(int x, int y, int z) {
        Assertions.assertEquals(x + y, z);
    }


    @Nested
    class StringTests {
        /**
         * It supports multiple parameters. Each value in the CSV is passed as a separate parameter to the test method.
         * If your data includes commas or other special characters, you can enclose the values in quotes.
         */
        @ParameterizedTest
        @CsvSource({
                "hello, 5",
                "'hello, world', 11",
                "'', 0"
        })
        void testStringLength(String input, int expectedLength) {
            assertEquals(expectedLength, input.length());
        }
    }

    @Nested
    class UserTest {

        /**
         * JUnit automatically converts the string values to the appropriate types of the test method parameters.
         */
        @ParameterizedTest
        @CsvSource({
                "Alice, 30, true",
                "Bob, , false",
                "'Charlie, Smith', 45, true"
        })
        void testUserValidity(String name, Integer age, boolean isValid) {
            User user = new User(name, age);
            assertEquals(isValid, UserValidator.isValid(user));
        }

        record User(String name, Integer age) {
        }

        static class UserValidator {

            public static boolean isValid(User user) {
                return user.age != null;
            }
        }
    }


    @ParameterizedTest
    @CsvSource(textBlock =
            """
                    1,2,3
                    4,5,6
                    """
    )
    void test1(int x, String y, int z) {
        System.out.println(x + y + z);
    }
}
