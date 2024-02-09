package _1_test.examples;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

/**
 * pay attention. some tools require class name ending with Test/Tests/Cases.
 */
public class ColorYourTestsExplicitlyExampleTest {


    /**
     * <p>@Test - annotation that help tools to recognize that this method is a test.</p>
     * <p> run it and you will see that it is green.</p>
     * <p> this approach named "no news is good news"</p>
     */
    @Test
    void ourFirstSuccessfulTest() {
    }

    /**
     * to make test red it is enough to throw Exception but...
     */
    @Test
    void ourFirstFailingTest() {
        throw new NullPointerException();
    }

    /**
     * there is one exclusion: TestAbortedException.
     * run and see result.
     */
    @Test
    void ourFirstAbortedTest() {
        throw new TestAbortedException();
    }

}
