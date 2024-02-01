package _14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedPracticeTest {
    /**
     * provide 3 values to @ValueSource to make test green
     */
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testPositives(int x) {
        Assertions.assertTrue(x > 0);
    }

}
