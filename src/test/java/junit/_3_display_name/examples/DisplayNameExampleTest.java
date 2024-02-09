package junit._3_display_name.examples;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * can change class name display
 */
@DisplayName("a special test case")
public class DisplayNameExampleTest {


    /**
     * you can increase readability of your test name
     */
    @Test
    @DisplayName("Custom test name containing spaces")
    void testDisplayNameWithSpaces() {
    }

    /**
     * you can use special characters
     */
    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    /**
     * and even emojis
     */
    @Test
    @DisplayName(" ✅")
    void testDisplayNameWithEmoji() {
    }

}
