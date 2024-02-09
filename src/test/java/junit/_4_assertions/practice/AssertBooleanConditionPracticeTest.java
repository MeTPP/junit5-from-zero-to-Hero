package _4_assertions.practice;

import org.junit.jupiter.api.Test;

public class AssertBooleanConditionPracticeTest {


    /**
     * TODO: make assertions assertTrue/assertFalse where necessary
     */
    @Test
    void checkIsAdult() {
        isAdult(12);
        isAdult(21);
        isAdult(59);
    }

    private boolean isAdult(int age) {
        return age < 18;
    }


}


