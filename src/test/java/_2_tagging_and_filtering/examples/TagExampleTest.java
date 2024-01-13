package _2_tagging_and_filtering.examples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("tags")
public class TagExampleTest {

    @Tag("slow")
    @Tag("db")
    @Test
    void testWithSlowTag() {
    }

    @Tag("fast")
    @Test
    void testWithFastTag() {
    }

}
