package junit._6_disabling_tests.examples;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled(value = "because of issue 42")
public class DisabledClassExampleTest {


    @Test
    @DisplayName("i can't start")
    void testWillNotStart() {

    }

    @Test
    @DisplayName("me too :(")
    void thisTestWillNotStartToo() {

    }

}
