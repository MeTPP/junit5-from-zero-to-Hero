package _19_extension_model.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

/**
 * {@code @RegisterExtension} is used to programmatically register extensions in JUnit 5.
 * This approach offers more flexibility in configuring the extensions.
 */
public class RegistrationExampleTest {
    /**
     * Extensions are registered as fields in the test class.
     * Allows for more dynamic configuration of extensions,
     * including the ability to set properties or invoke methods on extension instances before they are registered.
     */
    @RegisterExtension
    static CustomGreetingExtension customGreetingExtension = new CustomGreetingExtension("hello world!!!")
            .addSuffix("$");

    @Test
    void test() {

    }

}


class CustomGreetingExtension implements BeforeAllCallback {
    private String greeting;

    public CustomGreetingExtension(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println(greeting);
    }

    public CustomGreetingExtension addSuffix(String s) {
        greeting = greeting + s;
        return this;
    }
}