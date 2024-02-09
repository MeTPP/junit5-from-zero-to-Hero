package junit._19_extension_model.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TODO: implement CustomSetupExtension and pass test successfully
 */
public class ExtendWithPracticeTest {

    // @ExtendWith(CustomSetupExtension.class)
    @Test
    void testConfiguration(String st) {
        Assertions.assertEquals("hero", st);

    }
}



