package _14_parametrized_test.examples;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class ArgumentSourceExampleTest {


    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsSourceProvider.class)
    void test(String s) {
        System.out.println(s);
    }

}

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
