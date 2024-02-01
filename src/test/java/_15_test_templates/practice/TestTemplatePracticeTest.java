package _15_test_templates.practice;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class TestTemplatePracticeTest {

    @Nested
    class UserAccessTest {
        /**
         * TODO: Implement this test to verify access control based on the user role
         *  The method should test if different user roles have the correct access permissions
         */
        @TestTemplate
        @ExtendWith(UserRoleTestTemplateInvocationContextProvider.class)
        void testAccessBasedOnUserRole(String role) {
            Assertions.assertTrue(Set.of("ADMIN", "GUEST", "USER").contains(role));
        }

        static class UserRoleTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {

            @Override
            public boolean supportsTestTemplate(ExtensionContext context) {
                return true;
            }

            /**
             * TODO: Provide different user roles (like "ADMIN", "USER", "GUEST") to the test template
             */
            @Override
            public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
                return Stream.of(
                        provideContext("ADMIN"),
                        provideContext("USER"),
                        provideContext("GUEST")
                );
            }

            @NotNull
            private static TestTemplateInvocationContext provideContext(String role) {
                return new TestTemplateInvocationContext() {
                    @Override
                    public List<Extension> getAdditionalExtensions() {
                        return List.of(new ParameterResolver() {
                            @Override
                            public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                                return true;
                            }

                            @Override
                            public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                                return role;
                            }
                        });
                    }
                };
            }
        }
    }


    @Nested
    class InputFormatTest {

        /**
         * FIXME: This test is supposed to verify the method's handling of different input formats
         *         Currently, the test is not running as expected. Identify and correct the issues.
         */
        @TestTemplate
        @ExtendWith(InputFormatTestTemplateInvocationContextProvider.class)
        void testInputFormat(String input) {
            Assertions.assertTrue(Set.of("XML", "JSON", "PLAIN").contains(input));
        }

        static class InputFormatTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {

            /**
             * FIXME: something wrong here..
             */
            @Override
            public boolean supportsTestTemplate(ExtensionContext context) {
                return true;
            }

            /**
             * FIXME: Ensure that this method correctly provides different input formats for testing
             *  Consider formats like JSON, XML, and plain text
             */
            @Override
            public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
                return Stream.of(
                        provideContext("XML"),
                        provideContext("JSON"),
                        provideContext("PLAIN")
                );
            }

            @NotNull
            private static TestTemplateInvocationContext provideContext(String format) {
                return new TestTemplateInvocationContext() {

                    @Override
                    public String getDisplayName(int invocationIndex) {
                        return format;
                    }

                    @Override
                    public List<Extension> getAdditionalExtensions() {
                        return List.of(new ParameterResolver() {
                            @Override
                            public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                                return true;
                            }

                            @Override
                            public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
                                return format;
                            }
                        });
                    }
                };
            }
        }
    }
}
