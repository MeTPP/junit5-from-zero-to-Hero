package junit._19_extension_model.examples;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

/**
 * {@code @ExtendWith} is an annotation used to declare one or more extensions on a test class or test method.
 * Extensions specified with @ExtendWith are registered declaratively.
 */
@ExtendWith(CustomParamResolver.class)
public class ExtendWithExampleTest {


    /**
     * Can be used at the class level to apply an extension to all test methods within the class,
     * or at the method level to apply to a specific test.
     */
    @Test
    void test(String s) {
        Assertions.assertNull(s);
    }

    /**
     * Declarative Approach:
     * Extensions are declared as part of the test class or method,
     * making it clear which extensions are being used.
     */
    @ExtendWith(value = CustomParamResolver.class)
    @Test
    void test2(String s) {
        Assertions.assertNull(s);
    }
}

class CustomParamResolver implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return true;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return null;
    }
}
