package _19_extension_model.examples;

import org.junit.jupiter.api.extension.*;

public class AutoDetectedExtension implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Car.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new Car("audi");
    }


    public record Car(String model) {
    }
}
