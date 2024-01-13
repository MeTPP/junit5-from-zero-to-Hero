package _19_extension_model.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

public class RegistrationExampleTest {
    @RegisterExtension
    static CustomGreetingExtension customGreetingExtension = new CustomGreetingExtension("hello world!!!");

    @Test
    void test() {

    }

}


class CustomGreetingExtension implements BeforeAllCallback {
    private final String greeting;

    public CustomGreetingExtension(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println(greeting);
    }
}