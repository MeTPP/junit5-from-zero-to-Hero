package _6_disabling_tests.examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodExampleTest {


    @Test
    @Disabled("disabled")
    void disabledTest() {
    }


    @Test
    void thisTestWillPassSuccessfully() {
    }

}
