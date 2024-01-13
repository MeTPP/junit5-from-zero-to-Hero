package _16_dynamic_test.examples;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.junit.jupiter.api.Named.named;

public class DynamicTestExampleTestCase {

    // it is wrong. should return specified types.
    @TestFactory
    List<String> test() {
        return List.of("string");
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return List.of(
                dynamicTest("case 1", () -> assertTrue(true))
        );
    }

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
                                dynamicTest("length > 0", () -> assertTrue(input.length() > 0)),
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
                Stream.of(
                        dynamicTest("case 1", () -> assertTrue(true))
                )
        );
    }


}
