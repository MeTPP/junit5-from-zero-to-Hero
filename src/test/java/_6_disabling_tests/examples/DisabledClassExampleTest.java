package _6_disabling_tests.examples;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled(value = "because of issue 42")
public class DisabledClassExampleTest {


    @Test
    void test1() {

    }

    @Test
    void test2() {

    }

}
