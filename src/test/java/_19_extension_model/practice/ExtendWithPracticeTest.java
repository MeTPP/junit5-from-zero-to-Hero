package _19_extension_model.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

/**
 * TODO: implement CustomSetupExtension and pass test successfully
 */
public class ExtendWithPracticeTest {

    @ExtendWith(CustomSetupExtension.class)
    @Test
    void testConfiguration(String st) {
        Assertions.assertEquals("hero", st);

    }

    private static class CustomSetupExtension implements ParameterResolver {

        @Override
        public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return parameterContext.getParameter().getType() == String.class;
        }

        @Override
        public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
            return "hero";
        }
    }
}



