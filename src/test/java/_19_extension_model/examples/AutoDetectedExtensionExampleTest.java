package _19_extension_model.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutoDetectedExtensionExampleTest {

    @Test
    void test(AutoDetectedExtension.Car car) {
        Assertions.assertEquals("audi", car.model());
    }

}