package _2_tagging_and_filtering.practice;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * TODO: tag class with "fast". write 3 tests:
 * <ol>
 * <li>test1</li>
 * <li>test2</li>
 * <li>test3 -> tag this with @Tag("slow") check will it run or not?</li>
 * </ol>
 */
@Tag("fast")
public class ClassTagExampleTest {

    @Test
    void test1() {
    }

    @Test
    void test2() {
    }

    @Test
    @Tag("slow")
    void test3() {
    }

}
