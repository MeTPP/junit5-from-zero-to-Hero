package _2_tagging_and_filtering.practice;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MultipleTagsTest {

    /*
     * TODO: create test with tags: ui, end-to-end, integration, mocks
     */

    @Test
    @Tag("ui")
    @Tag("end-to-end")
    @Tag("integration")
    @Tag("mocks")
    void test() {
    }
}
