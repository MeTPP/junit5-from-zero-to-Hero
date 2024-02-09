package junit._14_parametrized_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * MethodSource is a powerful annotation used in JUnit 5 for parameterized tests.
 * It allows you to specify a method that will provide the parameters for your test.
 */
public class MethodSourceExampleTest {

    /**
     * By default, if you don't specify any value in the @MethodSource annotation,
     * JUnit looks for a method that has the same name as your test method.
     */
    @ParameterizedTest
    @MethodSource("provide")
    void test(Person person) {
        Assertions.assertTrue(person.age < 25);
        Assertions.assertEquals(4, person.name.length());
    }

    /**
     * The method you specify with @MethodSource must return a Stream, Iterable, or array of arguments.
     * The method providing the data can be in the same class as the test or in another class.
     * If it's in the same class, it must be static and can be private. If in a different class, the method must be public.
     */
    public static Stream<Arguments> provide() {
        return Stream.of(
                Arguments.arguments(new Person("John", 19)),
                Arguments.arguments(new Person("Stas", 23))
        );
    }

    record Person(String name, int age) {

    }
}
