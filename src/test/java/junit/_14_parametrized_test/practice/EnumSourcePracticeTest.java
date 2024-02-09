package _14_parametrized_test.practice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourcePracticeTest {


    /*
     * TODO: create test that will run for each value in Status enum
     */


    /**
     * FIXME: we need only IN_PROGRESS and END values to run. change accordingly.
     */
    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.EXCLUDE, names = {"IN_PROGRESS", "END"}, value = Status.class)
    void test1() {

    }

    /*
     *  TODO: create test that will start test only once. It should start with value which contains E.
     */


    /**
     * FIXME: change name param. we need to run tests only for enums that starts with "START"
     */
    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.MATCH_ALL, names = "START", value = Status.class)
    void test() {

    }


    enum Status {
        START,
        START_PREPARATION,
        IN_PROGRESS,
        END
    }

}
