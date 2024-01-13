package _3_display_name.examples;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("a special test case")
public class DisplayNameExampleTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testDisplayNameWithSpaces(){}

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName(" ✅")
    void testDisplayNameWithEmoji(){}

}
