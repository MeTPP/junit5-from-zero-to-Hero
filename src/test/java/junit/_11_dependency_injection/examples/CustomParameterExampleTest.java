package junit._11_dependency_injection.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

public class CustomParameterExampleTest {


    @Test
    @ExtendWith(MyParamResolver.class)
    void test(MyParam myParam) {
        Assertions.assertEquals("x", myParam.x());
    }

}

class MyParamResolver implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return true;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new MyParam("x");
    }
}

record MyParam(String x) {
}

