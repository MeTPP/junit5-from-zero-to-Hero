package junit._20_built_in_extension.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * {@code @TempDir} is a JUnit 5 extension used to create temporary directories that are tied to the lifecycle of a test.
 * These directories are guaranteed to be deleted after the tests are finished, ensuring no residual data is left behind.
 */
public class TempDirExampleTest {

    /**
     * The temporary directory and its contents are automatically deleted after the test method or class completes.
     */
    @TempDir
    Path filedPath;

    /**
     * Provides a unique and isolated environment for each test,
     * preventing tests from interfering with each other due to shared file system resources.
     */
    @Test
    void test(@TempDir Path dir) throws IOException {
        var p = dir.resolve("number.txt");
        Files.writeString(p, "junit-5-hero");
        Assertions.assertEquals("junit-5-hero", Files.readString(p));
        Assertions.assertTrue(Files.isDirectory(dir));
    }

    /**
     * Can be injected into test methods or test class constructors as a Path or File object.
     */
    @Test
    void test() throws IOException {
        var p = filedPath.resolve("number.txt");
        Files.writeString(p, "st");
        Assertions.assertEquals("st", Files.readString(p));
        Assertions.assertTrue(Files.isDirectory(p.getParent()));
    }

}
