package _19_extension_model.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * to enable autodetect of extensions you need to specify required extension in following file:
 * resources/META-INF/services/org.junit.jupiter.api.extension.Extension
 */
public class AutoDetectedExtensionExampleTest {

    @Test
    void test(AutoDetectedExtension.Car car) {
        Assertions.assertEquals("audi", car.model());
    }

}
