package _11_dependency_injection.practice;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoPracticeTest {

    /*
     * TODO: print all tags of this method using testInfo object
     */
    @Test
    @Tag("one")
    @Tag("two")
    @Tag("three")
    void test() {
    }


    /*
     * TODO: add display name to this test, print it, using testInfo
     */
    @Test
    void test1(TestInfo testInfo) {
    }

}
