package _19_extension_model.practice;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;

/**
 * TODO: make an extension
 *  that will count time between class test starts and ends.
 */

@ExtendWith(OwnTimeWatcherExtensionTest.TimeWatcher.class)
public class OwnTimeWatcherExtensionTest {


    @Test
    void test() throws InterruptedException {
        Thread.sleep(1000);
    }

    static class TimeWatcher implements BeforeAllCallback, AfterAllCallback {

        private long timeStart;

        @Override
        public void afterAll(ExtensionContext context) throws Exception {
            System.out.println("test run " + (System.currentTimeMillis() - timeStart) + " millis");
        }

        @Override
        public void beforeAll(ExtensionContext context) throws Exception {
            timeStart = System.currentTimeMillis();
        }
    }
}
