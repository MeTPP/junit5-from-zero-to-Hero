package junit._20_built_in_extension.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TempDirPracticeTest {

    @TempDir
    Path tempDir;

    /**
     * TODO using tempDir write 123 to file then read it and assert it.
     */
    @Test
    void writeToFile() {

    }


    /**
     * FIXME: make this test green. fix bug.
     */
    @Test
    void copyFileFromSourceToTarget(@TempDir Path source, @TempDir Path target) throws IOException {
        Path sourceFile = source.resolve("test.txt");
        Files.writeString(target, "abc");
        Path targetFile = Files.copy(sourceFile, target.resolve("test.txt"));

        Assertions.assertNotEquals(sourceFile, targetFile);
        Assertions.assertEquals(List.of("abc"), Files.readAllLines(targetFile));
    }


}
