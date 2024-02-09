package junit._4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertThrowsPracticeTest {


    /**
     * FIXME: fix this test.
     * assert that exception message equals to "boom!" in the end of the test
     */
    @Test
    void test() {
        Assertions.assertDoesNotThrow(() -> {
            throw new RuntimeException("boom!");
        });
    }

    /**
     * FIXME:   fix this test. change expected type.
     */
    @Test
    void test1() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            throw new NumberFormatException();
        });
    }

    /**
     * FIXME:  fix this test. change assertion method to more lenient.
     */
    @Test
    void test2() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            throw new NumberFormatException();
        });
    }

}
