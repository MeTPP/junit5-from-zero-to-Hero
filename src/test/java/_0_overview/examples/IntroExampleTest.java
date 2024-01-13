package _0_overview.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * <p><b>Hello and welcome to JUnit 5 simulator.</b></p>
 * <p> Each example is placed in folder with following structure:
 * test/java/_{lesson_number}_{lesson_name}/*ExampleTest
 * run each and try to guess/understand how its work. usually examples are accompanied by useful comments
 * </p>
 * <p>
 * As example you can check this class:
 * test/java/_0_overview/examples/IntroExampleTest
 * </p>
 * <p> next @see {@link  _0_overview.practice.IntroPracticeTest}</p>
 */
public class IntroExampleTest {


    /**
     * it is method that we will test
     */
    String greeting() {
        return "Hello Java Developer!";
    }

    /**
     * <p>this annotation is responsible to mark method as test</p>
     * <ol>
     * <li>run it using intellij idea runner</li>
     * <li>run it using gradle runner</li>
     * </ol><p>
     * <p>to change you can open settings and then follow this path: <b>Settings | Build, Execution, Deployment | Build Tools | Gradle</b>
     * <p>
     * you will see "Run tests using"
     */
    @Test
    void whenFirstGreeting_ThenReturnMessage() {
        // it is checking that our method provide value that we expect
        Assertions.assertEquals("Hello Java Developer", greeting());
    }


}
