package _7_conditional_test_execution.examples;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.condition.OS.MAC;

/**
 * test may be enabled or disabled on a particular operating system, architecture,
 * or combination of both
 */
public class OsConditionExampleTest {


    @EnabledOnOs(MAC)
    @Test
    void testOnMac() {
    }

    @EnabledOnOs({OS.LINUX, MAC})
    @Test
    void testOnMacAndLinux() {

    }

    @Test
    @DisabledOnOs(MAC)
    void disabledOnMac() {
    }

    @TestOnWindows
    void test() {
    }

    @Test
    @EnabledOnOs(value = MAC, architectures = "aarch64")
    void testOnNewMacs() {
    }

}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Test
@EnabledOnOs(OS.WINDOWS)
@interface TestOnWindows {
}
