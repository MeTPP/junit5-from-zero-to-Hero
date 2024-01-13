package _11_dependency_injection.practice;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoPracticeTest {

    // sout all tags of this method you can't use sout("one"), sout("two") etc
    @Test
    @Tag("one")
    @Tag("two")
    @Tag("three")
    void test() {
    }


    // add display name to this test
    // sout it using test info
    @Test
    void test1(TestInfo testInfo) {
    }

}
