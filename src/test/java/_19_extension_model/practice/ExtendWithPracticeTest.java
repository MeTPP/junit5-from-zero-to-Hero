package _19_extension_model.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtendWithPracticeTest {
    /**
     * TODO: implement CustomSetupExtension and pass test successfully
     */
//    @ExtendWith(CustomSetupExtension.class)
    @Test
    void testConfiguration(String st) {
        Assertions.assertEquals("hero", st);

    }
}



