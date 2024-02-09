package _15_test_templates.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;

import java.util.List;
import java.util.stream.Stream;

/**
 * {@code @TestTemplate} in JUnit 5, this is a more advanced and flexible feature for writing tests.
 * It allows you to declare a method as a template for test cases and then use multiple custom extensions to provide the actual test cases.
 * This approach is particularly useful when you want to execute the same test logic under different conditions or configurations.
 */
public class TestTemplateExample {


    /**
     * fail without TestTemplateInvocationContextProvider
     */
    @TestTemplate
    void test() {

    }

    /**
     * A method annotated with @TestTemplate is not a regular test case but rather a template for test cases.
     * It signifies that the actual tests will be determined at runtime by extensions.
     */
    @TestTemplate
    @Tag("custom")
    @ExtendWith(CustomTestTemplateInvocationProvider.class)
    void testWithProvider() {

    }

    /**
     * This feature is quite powerful and is used for more sophisticated testing scenarios,
     * such as running the same set of tests across different environments, configurations,
     * or with different sets of input data. It offers a high level of customization and control over how tests are executed.
     */
    @Nested
    class ExampleTest {

        /**
         * This method can be invoked multiple times with different parameters or contexts,
         * depending on what the extensions provide.
         */
        @TestTemplate
        @ExtendWith(MyTestTemplateInvocationContextProvider.class)
        void testTemplateMethod(String parameter) {
            Assertions.assertNotNull(parameter);
        }

        /**
         * To provide the concrete tests, you use extensions like TestTemplateInvocationContextProvider.
         * These extensions decide how many times and with which parameters the test template method should be invoked.
         */
        static class MyTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {

            @Override
            public boolean supportsTestTemplate(ExtensionContext context) {
                return true;
            }

            /**
             * It offers greater flexibility than standard parameterized tests,
             * as it allows for more dynamic and complex scenarios.
             */
            @Override
            public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
                return Stream.of(invocationContext("foo"), invocationContext("bar"));
            }

            private TestTemplateInvocationContext invocationContext(String parameter) {
                return new TestTemplateInvocationContext() {
                    @Override
                    public List<Extension> getAdditionalExtensions() {
                        return List.of(new ParameterResolver() {
                            @Override
                            public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                                return parameterContext.getParameter().getType().equals(String.class);
                            }

                            @Override
                            public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                                return parameter;
                            }
                        });
                    }
                };
            }
        }
    }


}

class CustomTestTemplateInvocationProvider implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return context.getTags().contains("custom");
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return Stream.of(new TestTemplateInvocationContext() {
                             @Override
                             public String getDisplayName(int invocationIndex) {
                                 return "customDisplayName";
                             }

                             @Override
                             public List<Extension> getAdditionalExtensions() {
                                 return List.of((BeforeTestExecutionCallback) context1 -> System.out.println("additional extension")
                                 );
                             }
                         }
        );
    }
}

