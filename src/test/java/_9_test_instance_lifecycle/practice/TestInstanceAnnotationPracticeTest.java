package _9_test_instance_lifecycle.practice;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceAnnotationPracticeTest {

    /*
     * TODO: create method annotated with @BeforeEach
     */

    @BeforeEach
    void setUp() {

    }
    /*
     *   TODO: create setupMethod annotated with @BeforeAll. make it possible to use without
     *    static modifier. then run tests method.
     */

    @BeforeAll
    void beforeAll() {

    }
    /*
     * TODO: create method annotated with @AfterEach
     */

    @AfterEach
    void tearDown() {

    }

    /*
     * TODO: create method annotated with @AfterAll
     */

    @AfterAll
    void afterAll() {

    }

    @Test
    void tests() {
    }


}
