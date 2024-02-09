package junit._19_extension_model.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 *
 */
public class RegisterExtensionPracticeTest {


    @RegisterExtension
    static MockServiceExtension mockService = new MockServiceExtension().configure("World!!!");

    /**
     * FIXME: Implement a test that uses the injected mock service
     *         The mock service should be pre-configured with the necessary settings for testing
     */
    @Test
    void testServiceMethod() {
        Assertions.assertEquals(mockService.greet(), "hello! World!!!");

    }


    private static class MockServiceExtension {
        private String greet;

        public MockServiceExtension() {
            greet = "hello!";
        }

        public MockServiceExtension configure(String testConfiguration) {
            greet = greet + testConfiguration;
            return this;
        }


        /**
         * hint.
         */
        //        @Override
        public void beforeAll(ExtensionContext context) throws Exception {
            System.out.println(greet);
        }

        public String greet() {
            return greet;
        }
    }
}
