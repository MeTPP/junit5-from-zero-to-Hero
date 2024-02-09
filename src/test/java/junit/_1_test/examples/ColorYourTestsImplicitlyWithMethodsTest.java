package junit._1_test.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;


/**
 * before trying this visit previous class:  {@link ColorYourTestsExplicitlyExampleTest }
 * <p>
 * don't worry if you don't know Assertions and Assumptions. we will cover it later.
 * just understand underlying concept.
 */
public class ColorYourTestsImplicitlyWithMethodsTest {


    /**
     * good news is good news. true still equals true:)
     */
    @Test
    void ourFirstSuccessfulTest() {
        Assertions.assertTrue(true);
    }

    /**
     * look what kind of exception is thrown.
     */
    @Test
    void ourFirstFailingTest() {
        Assertions.fail();
    }


    /**
     * look what kind of exception is thrown.
     */
    @Test
    void ourFirstAbortedTest() {
        Assumptions.abort();
    }

}
