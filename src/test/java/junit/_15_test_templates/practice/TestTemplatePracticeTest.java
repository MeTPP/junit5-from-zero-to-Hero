package junit._15_test_templates.practice;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

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
                return Stream.empty();
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

        }

        static class InputFormatTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {

            /**
             * FIXME: something wrong here..
             */
            @Override
            public boolean supportsTestTemplate(ExtensionContext context) {
                return false;
            }

            /**
             * FIXME: Ensure that this method correctly provides different input formats for testing
             *  Consider formats like JSON, XML, and plain text
             */
            @Override
            public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
                return Stream.empty();
            }
        }
    }
}
