package _11_dependency_injection.practice;

import org.junit.jupiter.api.DisplayName;
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
    void test(TestInfo testInfo) {
        System.out.println(testInfo.getTags());
    }


    /*
     * TODO: add display name to this test, print it, using testInfo
     */
    @Test
    @DisplayName("our test")
    void test1(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

}
