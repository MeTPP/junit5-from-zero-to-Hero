package _11_dependency_injection.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepetitionInfoExampleTest {

    @RepeatedTest(3)
    void repeatedTest(RepetitionInfo repetitionInfo) {
        Assertions.assertEquals(3, repetitionInfo.getTotalRepetitions());
    }
}
