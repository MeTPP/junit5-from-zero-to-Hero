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
        Assertions.assertNull(x);
    }

    /**
     * TODO: Using Assertions.assertNotNull()/Assertions.assertNull()
     *  test provider() method.
     */
    String provider() {
        return "";
    }

    @Test
    void testProvider() {
        Assertions.assertNotNull(provider());
        Assertions.assertNull(provider());
    }



    /*
     * TODO: create 5 tests assigning Integer, Object, String,TestEnum, TestRecord to null
     *  and then assert them using assertNull/assertNotNull
     */
    @Test
    void test1() {
        Integer x = null;
        Assertions.assertNull(x);

    }

    @Test
    void test2() {

        String x = null;
        Assertions.assertNull(x);

    }

    @Test
    void test3() {
        Object o = new Object();
        Assertions.assertNotNull(o);

    }
    @Test
    void test4() {

        var testRecord = new TestRecord();
        Assertions.assertNotNull(testRecord);

    }

    @Test
    void test5() {

        TestEnum testEnum = null;
        Assertions.assertNull(null);

    }


    record TestRecord() {
    }

    enum TestEnum {

    }

}
