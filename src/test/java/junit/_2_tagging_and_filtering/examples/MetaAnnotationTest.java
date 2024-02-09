package junit._2_tagging_and_filtering.examples;

import junit._2_tagging_and_filtering.examples.tags.Slow;
import org.junit.jupiter.api.Test;

public class MetaAnnotationTest {

    @Slow // we can create our own annotation. it is more convenient. and it can be reused everywhere in project.
    @Test
    public void slowTest() {
    }

}
