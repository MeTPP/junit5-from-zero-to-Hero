package _20_built_in_extension.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDirExampleTest {

    @TempDir
    Path filedPath;

    @Test
    void test(@TempDir Path dir) throws IOException {
        var p = dir.resolve("number.txt");
        Files.writeString(p, "st");
        Assertions.assertEquals("st", Files.readString(p));
        Assertions.assertTrue(Files.isDirectory(dir));
    }

    @Test
    void test() throws IOException {
        var p = filedPath.resolve("number.txt");
        Files.writeString(p, "st");
        Assertions.assertEquals("st", Files.readString(p));
        Assertions.assertTrue(Files.isDirectory(p.getParent()));
    }

}
