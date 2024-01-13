package _14_parametrized_test.examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceExampleTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,2,3",
            "4,5,6",
    })
    void test(int x, String y, int z) {
        System.out.println(x + y + z);
    }

    @ParameterizedTest
    @CsvSource(textBlock =
            """
                    1,2,3
                    4,5,6
                    """
    )
    void test1(int x, String y, int z) {
        System.out.println(x + y + z);
    }
}
