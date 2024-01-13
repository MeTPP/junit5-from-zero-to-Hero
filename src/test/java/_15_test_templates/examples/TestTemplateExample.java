package _15_test_templates.examples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.*;

import java.util.List;
import java.util.stream.Stream;

public class TestTemplateExample {


    @TestTemplate
    void test() {
        // fail without TestTemplateInvocationContextProvider
    }

    @TestTemplate
    @Tag("custom")
    @ExtendWith(CustomTestTemplateInvocationProvider.class)
    void testWithProvider() {

    }

}

class CustomTestTemplateInvocationProvider implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return context.getTags().contains("custom");
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return
                Stream.of(new TestTemplateInvocationContext() {
                              @Override
                              public String getDisplayName(int invocationIndex) {
                                  return "customDisplayName";
                              }

                              @Override
                              public List<Extension> getAdditionalExtensions() {
                                  return List.of(
                                          (BeforeTestExecutionCallback) context1 -> System.out.println("additional extension")
                                  );
                              }
                          }
                );
    }
}

