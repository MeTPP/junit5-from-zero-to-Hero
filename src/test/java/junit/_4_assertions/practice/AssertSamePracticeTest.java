package junit._4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertSamePracticeTest {


    /**
     * TODO: change assertion to make test green
     */
    @Test
    void testObjectsSame(){
        Assertions.assertSame(new Object(), new Object());
    }


    /**
     * TODO: using  Assertions.assertNotSame/ Assertions.assertSame
     * assert if this objects same
     */
    @Test
    void assertSame() {
        var expected = Integer.valueOf(12);
        var actual = Integer.valueOf(12);
        Assertions.assertSame(expected, actual);
    }

    /**
     * TODO: using  Assertions.assertNotSame/ Assertions.assertSame
     * assert if this objects same
     */
    @Test
    void assertNotSame() {
        var expected = Integer.valueOf(1000);
        var actual = Integer.valueOf(1000);
        Assertions.assertNotSame(expected, actual);
    }

}
