package _14_parametrized_test.practice;

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
    void test(int home, String car) {

    }


    /**
     * FIXME: change separator and make this test green (p.s. don't change value)
     */
    @ParameterizedTest
    @CsvSource(value = {
            "first#second",
            "third#forth"
    }, delimiterString = "#")
    void test1(String x, String y) {

    }

    /**
     * FIXME: skip headline in csv and make test green
     */
    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = false
            , textBlock =
            """
                    #name,surname
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
    @ParameterizedTest
    @CsvSource(
            textBlock =
                    """
                            x,1
                            y,1
                            """
    )
    void ownTest(String string, int i) {
        Assertions.assertEquals(1, i);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "1,2,3",
                    "4,5,6"
            }
    )
    void numbers(int x, int y, int z) {

    }
}
