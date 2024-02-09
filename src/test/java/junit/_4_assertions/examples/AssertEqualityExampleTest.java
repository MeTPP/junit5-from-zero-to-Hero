package junit._4_assertions.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * assertEquals - assert that expected and actual are equal.
 */
public class AssertEqualityExampleTest {
    
    /**
     * simple check
     */
    @Test
    void testAsertEquals() {
        Assertions.assertEquals(1, 1);
    }

    /**
     * check with message that will be shown in case of failure.
     */
    @Test
    void testAssertEqualsWithFailStringMessage() {
        Assertions.assertEquals(1, 0, "should be equal");
    }


    /**
     * check with message supplier that will be supply message shown in case of failure.
     */
    @Test
    void testAssertEqualsWithFailStringSupplierMessage() {
        Assertions.assertEquals(2, 1, () -> "should be equal");
    }


}
