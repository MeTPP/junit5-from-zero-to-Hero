package junit._14_parametrized_test.practice;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class ArgumentSourcePracticeTest {


    @Nested
    class EdgeCaseTest {

        /**
         * TODO: Modify this provider to include edge cases for the test
         *   Example: Adding null values or extreme numbers
         *   add test implementation
         */
        @ParameterizedTest
        @ArgumentsSource(EdgeCaseArgumentsProvider.class)
        void testEdgeCases(Integer value1, Integer value2) {
            // Test implementation here
        }

        static class EdgeCaseArgumentsProvider implements ArgumentsProvider {
            @Override
            public Stream<? extends Arguments> provideArguments(ExtensionContext context) {

                return Stream.of(
                        Arguments.of(1, 1),
                        Arguments.of(2, 2)
                );
            }
        }
    }


    /**
     * TODO: Implement a provider that returns a stream of Arguments for simple arithmetic tests
     *  Example: Arguments.of(2, 3, 5) for a test method that adds two numbers and expects a sum
     *  change ArithmeticTest.
     */
    static class ArithmeticTest {

        /**
         * Test implementation here
         */
        @ParameterizedTest
        @ArgumentsSource(SimpleArgumentsProvider.class)
        void testAddition(int a, int b, int expectedSum) {

        }

        static class SimpleArgumentsProvider implements ArgumentsProvider {
            @Override
            public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
                return Stream.empty();
            }
        }
    }

    /*
     * TODO: Implement a provider that returns a stream of Arguments for testing string manipulation methods
     *   Example: Arguments.of("hello", "HELLO") for testing a method that converts strings to uppercase
     */

    /*
     * TODO: Implement a dynamic provider that generates different user objects for validation testing
     *  Consider generating users with various attributes (e.g., different ages, names, roles)
     */

    record User(String name, String role, Integer age) {
    }

}
