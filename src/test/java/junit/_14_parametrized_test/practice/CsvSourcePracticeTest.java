package junit._14_parametrized_test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourcePracticeTest {


    /**
     * FIXME: make test green
     */
    @ParameterizedTest
    @CsvSource(textBlock = """
                        1,car
                        2,home
            """)
    void test(String car, int home) {

    }


    /**
     * FIXME: change separator and make this test green (p.s. don't change value)
     */
    @ParameterizedTest
    @CsvSource(value = {
            "first#second",
            "third#forth"
    })
    void test(String x, String y) {

    }

    /**
     * FIXME: skip headline in csv and make test green
     */
    @ParameterizedTest
    @CsvSource(textBlock =
            """
                    name,surname
                    Dalisa,Silvernail
                    Payal,Cadena
                     """
    )
    void test12(String x, String y) {
        Assertions.assertNotEquals("name", x);
        Assertions.assertNotEquals("surname", y);

    }


    /*
     * TODO: create your own 2 parametrized tests using @CsvSource.
     */
}
