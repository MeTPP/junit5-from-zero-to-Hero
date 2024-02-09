package _5_assumptions.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AssumptionBooleanPracticeTest {


    /*
     * TODO: make this test green
     */
    @Test
    void test() {
        Assumptions.assumeTrue(hasMinimumProcessors(50));
        Assertions.assertTrue(true);
    }


    /*
     * TODO: make this test green
     */
    @Test
    void testUserLoginStatus() {
        Assumptions.assumeTrue(isUserLoggedIn(false), "Assumption failed because the user is not logged in");
        Assertions.assertTrue(true);
    }


    /*
     * TODO: create assumption based on isRandomPositive() method
     */

    private boolean isRandomPositive() {
        Random random = new Random();
        int randomNumber = random.nextInt(); // Unbounded random integer
        return randomNumber > 0;
    }


    private boolean isUserLoggedIn(boolean isUserLoggedIn) {
        return isUserLoggedIn;
    }


    private boolean hasMinimumProcessors(int minProcessors) {
        return Runtime.getRuntime().availableProcessors() >= minProcessors;
    }
}
