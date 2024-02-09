package junit._11_dependency_injection.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

public class CustomParameterPracticeTest {


    /**
     * TODO: create test green.
     */
    @Test
    @ExtendWith(StringParamResolver.class)
    void test(Integer x) {
        Assertions.assertEquals("5", x + "");
    }


    static class StringParamResolver implements ParameterResolver {

        @Override
        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return false;
        }

        @Override
        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return null;
        }
    }
}
