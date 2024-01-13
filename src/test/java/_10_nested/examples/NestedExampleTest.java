package _10_nested.examples;


import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedExampleTest {

    @Test
    void outerTest(){}

    @Nested
    class FirstNestedClassCase {
        @Test
        void firstNestedMethod() {

        }
    }

    @Nested
    class SecondNestedClassCase {

        @Test
        void secondNestedMethod() {
        }

    }


}
