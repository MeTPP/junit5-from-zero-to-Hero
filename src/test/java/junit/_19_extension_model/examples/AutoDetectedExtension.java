package junit._19_extension_model.examples;

import org.junit.jupiter.api.extension.*;

/**
 * Extensions in JUnit 5 are a powerful way to extend its functionality and customize the test execution process.
 * They are part of JUnit 5's new programming model that replaces JUnit 4's rule-based model.
 */
public class AutoDetectedExtension implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Car.class;
    }

    /**
     * extensions can be used to provide parameters to test methods or constructors dynamically.
     */
    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new Car("audi");
    }

    public record Car(String model) {
    }
}
