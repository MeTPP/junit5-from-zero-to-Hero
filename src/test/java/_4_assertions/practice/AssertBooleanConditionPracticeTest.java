package _4_assertions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertBooleanConditionPracticeTest {


    /**
     * TODO: make assertions assertTrue/assertFalse where necessary
     */
    @Test
    void checkIsAdult() {
        Assertions.assertFalse(isAdult(12));
        Assertions.assertTrue(isAdult(21));
        Assertions.assertTrue(isAdult(59));
    }

    private boolean isAdult(int age) {
        return age > 18;
    }


}


