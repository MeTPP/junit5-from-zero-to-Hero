package _2_tagging_and_filtering.examples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tag("tags") // this tag applies to all test methods.
public class TagExampleTest {

    @Tag("slow")  // tag annotation is repeatable - we can use as much as we want
    @Tag("db")
    @Test
    void testWithSlowTag() {
    }

    @Tags({@Tag("slow"), @Tag("db")}) // but we also can use @Tags annotation.
    @Test
    void testWithTags() {
    }

    @Tag("fast")
    @Test
    void testWithFastTag() {
    }

}
