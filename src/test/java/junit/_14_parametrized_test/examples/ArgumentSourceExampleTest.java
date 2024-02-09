package junit._14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

/**
 * ArgumentsSource is an annotation in JUnit 5 used in parameterized tests to specify a custom, programmable source for arguments.
 * It allows for maximum flexibility in how test data is provided,
 * especially when standard sources like @ValueSource or @CsvSource are not sufficient or when complex argument objects are needed.
 * Argument providers can be reused across different test classes or methods.
 */
public class ArgumentSourceExampleTest {


    /**
     * You need to create a class that implements the ArgumentsProvider interface. This class defines how the arguments are provided.
     */
    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsSourceProvider.class)
    void test(String s) {
        Assertions.assertNotNull(s);
    }

    @ParameterizedTest
    @ArgumentsSource(PairArgumentsProvider.class)
    void testAdd(int a, int b, int sum) {
        Assertions.assertEquals(sum, a + b);
    }

    static class PairArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(1, 2, 3),
                    Arguments.of(4, 5, 9),
                    Arguments.of(7, 8, 15)
            );
        }
    }

}

/**
 * It can be used to create complex test data scenarios, including conditional data generation,
 * reading from files or databases, or complex calculations.
 */
class CustomArgumentsSourceProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.arguments("x"),
                Arguments.arguments("y"),
                Arguments.arguments("z")
        );
    }
}
