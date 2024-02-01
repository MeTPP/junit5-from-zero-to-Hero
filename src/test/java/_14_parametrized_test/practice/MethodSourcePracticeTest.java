package _14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodSourcePracticeTest {


    /**
     * FIXME: make test green
     */
    @ParameterizedTest
    @MethodSource("provideStringValues")
    void testPerson(String st) {
        Assertions.assertEquals(1, st.length());
    }

    /**
     * FIXME: make test green
     */
    @ParameterizedTest
    @MethodSource("provideIntegersValues")
    void testPerson(Integer i) {

    }


    /**
     * TODO: create parametrized Test
     * with method source that will provide 5 different Persons {@link Person}
     */
    void testPerson(Person person) {
        Assertions.assertAll(
                () -> Assertions.assertTrue(person.age > 18),
                () -> Assertions.assertNotNull(person.name),
                () -> Assertions.assertTrue(person.name.startsWith("J"))
        );
    }

    @Nested
    class CalculatorTests {

        /**
         * FIXME: make test green
         */
        @ParameterizedTest
        @MethodSource("_14_parametrized_test.practice.DataProviders#provideStrings")
        void testStringLength(String input, int expectedLength) {
            Assertions.assertEquals(expectedLength, input.length());
        }
    }


    public static Stream<Integer> provideIntegersValues() {
        return IntStream.range(0, 5).boxed();
    }

    Stream<Arguments> provideStringValues() {
        return Stream.of(
                Arguments.arguments("x"),
                Arguments.arguments("y")
        );
    }

    record Person(String name, Integer age) {
    }
}
class DataProviders {
    public static Stream<Arguments> provideStrings() {
        return Stream.of(
                    Arguments.of(5, "hello"),
                    Arguments.of(12, "JUnit")
        );
    }
}