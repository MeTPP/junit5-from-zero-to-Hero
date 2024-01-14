package _2_tagging_and_filtering.practice;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class GradleFilterTest {

    /*
     *   TODO write test with @Tag("fast") - find way to run this test (without excludeTags removal)
     */

    @Test
//    @Tag("fast")
    @Tag("slow")
    void test() {


    }

}
