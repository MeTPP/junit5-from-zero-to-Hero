package _4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullAndNotNullPracticeTest {


    /**
     * TODO: make test green
     */
    @Test
    void testNull() {
        String x = null;
        Assertions.assertNotNull(x);
    }

    /**
     * TODO: Using Assertions.assertNotNull()/Assertions.assertNotNull()
     *  test provider() method.
     */
    String provider() {
        return "";
    }



    /*
     * TODO: create 5 tests assigning Integer, Object, String,TestEnum, TestRecord to null
     *  and then assert them using assertNull/assertNotNull
     */


    record TestRecord() {
    }

    enum TestEnum {

    }

}
