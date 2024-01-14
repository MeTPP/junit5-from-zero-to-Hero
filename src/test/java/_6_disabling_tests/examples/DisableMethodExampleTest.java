package _6_disabling_tests.examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableMethodExampleTest {


    @Test
    @Disabled("disabled")
    void test1() {
    }


    @Test
    void test2() {
    }

}
