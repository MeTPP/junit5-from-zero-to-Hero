package junit._4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualityPracticeTest {


    /*
      TODO: create test that will assert result of execution calculateScore(15,"Jane") with expected value.
      calculate expected value by yourself.
     */


    /**
     * TODO: make test green
     */
    @Test
    void assertEquals() {
        Assertions.assertEquals("Hello World", greeting());
    }


    private String greeting() {
        return "Hello World!";
    }

    private int calculateScore(int age, String name) {
        return age + name.length();
    }


}
