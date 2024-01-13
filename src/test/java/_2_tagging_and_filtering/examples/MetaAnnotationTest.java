package _2_tagging_and_filtering.examples;

import _2_tagging_and_filtering.examples.tags.Slow;
import org.junit.jupiter.api.Test;

public class MetaAnnotationTest {

    @Slow
    @Test
    public void slowTest() {
    }

}
