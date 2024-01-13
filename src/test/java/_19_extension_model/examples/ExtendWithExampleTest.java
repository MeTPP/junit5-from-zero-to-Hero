package _19_extension_model.examples;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

@ExtendWith(CustomParamResolver.class)
public class ExtendWithExampleTest {

    @Test
    void test(String s) {
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
