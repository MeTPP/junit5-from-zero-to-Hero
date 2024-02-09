package junit._3_display_name.practice;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;


public class DisplayNameGeneratorsTest {

    @Nested
    class SimpleDisplayNameCheck {
        /**
         * TODO: add Simple DisplayNameGenerator to nested class SimpleDisplayNameCheck
         */
        @Test
        void test() {
        }

    }

    /* TODO:
        create class StandardDisplayNameCheck , one test method inside it.
     *  and add Standard DisplayNameGenerator to it.
     */


    /**
     * TODO:  add display generator that will remove underscores in names
     */
    @Nested
    class Replace_underscores_please {

        @Test
        void method_to_check_underscores_removal() {
        }
    }

    @Nested
    @IndicativeSentencesGeneration(separator = "___", generator = DisplayNameGenerator.IndicativeSentences.class)
    class IndicativeSentencesGenerationExample {


        /**
         * TODO: display methods name without underscores - you can't use @DisplayName
         */
        @Test
        void check_this() {
        }

        /**
         * TODO: display methods name without underscores - you can't use @DisplayName
         */
        @Test
        void and_check_this() {
        }

    }

    /*
     * TODO:
     *     create class annotated with @Nested and @IndicativeSentencesGeneration
     *     using separator = "###" and generator that replaces underscores
     *     with two simple tests inside
     */


    /*
     * TODO:create nested class with @IndicativeSentencesGeneration with separator "!!!"
     * don't specify generator
     */


    /**
     * TODO: run tests inside this class.
     * find way to change name of Nested class to "our custom name" using tag annotation beyond the method
     */
    @Nested
    @DisplayNameGeneration(CustomDisplayNameGenerator.class)
    @Tag("our custom name")
    class OurCustomDisplayNameGeneration {

        @Test
        void simpleTest() {
        }

    }


    /*
     *  TODO: write your own DisplayNameGenerator that will:
     *      display name for class with logic: "JUNIT5_HERO + className"
     *      where JUNIT5_HERO is constant and class name - variable
     *      method name display should: add "%" in the end of each method name
     */


}


class CustomDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return nestedClass.getName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return null;
    }
}
