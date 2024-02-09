package junit._3_display_name.examples;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;


/**
 * you can specify @DisplayNameGeneration - that will be applied for class and for test methods
 */
public class DisplayNameGeneratorsExampleTest {


    /**
     * DisplayNameGenerator replaces underscores with spaces
     */
    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class Replace_Underscores {

        @Test
        void even_in_methods() {
        }

    }

    /**
     * IndicativeSentences - generator that generates complete sentences
     */
    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
    class IndicativeSentencesGenerationExample {
        @Test
        void testMethod() {
        }

    }


    /**
     * IndicativeSentencesGeneration is used to register
     * the DisplayNameGenerator.IndicativeSentences display name generator.
     * you can change separator.
     */
    @Nested
    @IndicativeSentencesGeneration(separator = "👻", generator = DisplayNameGenerator.ReplaceUnderscores.class)
    class IndicativeSentencesGenerationAnnotationExample {
        @Test
        void test_method() {
        }
    }

    /**
     * Standard DisplayNameGenerator - default.
     */
    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.Standard.class)
    class StandardExample {
        @Test
        void testMethod() {
        }
    }


    /**
     * Simple DisplayNameGenerator that removes trailing parentheses for methods with no parameters.
     */
    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.Simple.class)
    class SimpleExample {
        @Test
        void testMethod() {
        }
    }

    /**
     * it is possible to create your own display name generator
     */
    @Nested
    @DisplayNameGeneration(CustomNameGenerator.class)
    class CustomNameGeneratorExample {
        @Nested
        class CustomNestedExample {
            @Test
            void test() {
            }

        }

        @Test
        void test() {
        }
    }

    /**
     * to do it you need implement DisplayNameGenerator interface
     */
    static class CustomNameGenerator implements DisplayNameGenerator {

        @Override
        public String generateDisplayNameForClass(Class<?> testClass) {
            return "💻" + testClass.getName();
        }

        @Override
        public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
            return "💻" + nestedClass.getName();
        }

        @Override
        public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
            return "💻" + testMethod.getName();
        }
    }
}
