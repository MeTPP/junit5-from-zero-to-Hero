package _14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceExampleTest {

    @ParameterizedTest
    @MethodSource("provide")
    void test(Person person) {
        Assertions.assertTrue(person.age < 25);
        Assertions.assertEquals(4, person.name.length());
    }

    public static Stream<Arguments> provide() {
        return Stream.of(
                Arguments.arguments(new Person("John", 19)),
                Arguments.arguments(new Person("Stas", 23))
        );
    }

    record Person(String name, int age) {

    }
}
