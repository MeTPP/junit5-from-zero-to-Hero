package _16_dynamic_test.examples;

import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.junit.jupiter.api.Named.named;

/**
 * This feature allows for creating tests dynamically at runtime,
 * providing a high level of flexibility and control over test execution.
 */
public class DynamicTestExampleTestCase {

    /**
     * A @TestFactory method must return a Stream, Collection, Iterable, or Iterator of DynamicTest instances.
     */
    @TestFactory
    List<String> test() {
        return List.of("string");
    }

    /**
     * {@code @TestFactory} is used to denote a method that is a factory for dynamic tests.
     * Unlike standard @Test methods, @TestFactory methods don't contain the tests themselves but rather generate them.
     */
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return List.of(
                dynamicTest("case 1", () -> assertTrue(true)),
                dynamicTest("case 2", () -> assertTrue(true))
        );
    }

    /**
     * DynamicTest is a class in JUnit 5 that represents a dynamically generated test case.
     * Each DynamicTest instance is a single test case.
     */
    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Set.of(
                dynamicTest("case 2", () -> assertTrue(true))
        );
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator() {
        return List.of(
                dynamicTest("case 3", () -> assertTrue(true))
        ).iterator();
    }

    @TestFactory
    DynamicTest[] dynamicTestsFromArray() {
        return new DynamicTest[]{
                dynamicTest("case 1", () -> assertTrue(true))
        };
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        return Stream.of(dynamicTest("case 1", () -> assertTrue(true)));
    }

    /**
     * Dynamic tests are useful when the number of tests and the parameters
     * for each test aren't known at compile time but are determined at runtime.
     */
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {
        return IntStream.iterate(0, n -> n + 2)
                .limit(2)
                .mapToObj(i -> dynamicTest("case " + i, () -> assertTrue(true)));
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamFactoryMethodWithNames() {
        // Stream of palindromes to check
        Stream<Named<String>> inputStream = Stream.of(
                named("racecar is a palindrome", "racecar"),
                named("radar is also a palindrome", "radar"),
                named("mom also seems to be a palindrome", "mom"),
                named("dad is yet another palindrome", "dad")
        );

        // Returns a stream of dynamic tests.
        return DynamicTest.stream(inputStream,
                text -> assertTrue(true));
    }

    @TestFactory
    Stream<DynamicNode> dynamicTestsWithContainers() {
        return Stream.of("A", "B", "C")
                .map(input -> dynamicContainer("Container " + input, Stream.of(
                        dynamicTest("not null", () -> assertNotNull(input)),
                        dynamicContainer("properties", Stream.of(
                                dynamicTest("length > 0", () -> assertFalse(input.isEmpty())),
                                dynamicTest("not empty", () -> assertFalse(input.isEmpty()))
                        ))
                )));
    }

    @TestFactory
    DynamicNode dynamicNodeSingleTest() {
        return dynamicTest("'pop' is a palindrome", () -> assertTrue(true));
    }

    @TestFactory
    DynamicNode dynamicNodeSingleContainer() {
        return dynamicContainer("single container",
                Stream.of(dynamicTest("case 1", () -> assertTrue(true)))
        );
    }

    @Nested
    class DynamicTestsDemo {

        @TestFactory
        Collection<DynamicTest> dynamicTestsFromCollection() {
            return Arrays.asList(
                    DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
                    DynamicTest.dynamicTest("Multiply test", () -> assertEquals(20, Math.multiplyExact(5, 4)))
            );
        }
    }


}
