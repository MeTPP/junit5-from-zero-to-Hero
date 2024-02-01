package _17_timeouts.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TimeoutWithParametrizedPracticeTest {

    /**
     * TODO: Write a Parameterized Test for a Data Processing Method with Timeout
     *  Implement a parameterized test for a data processing method that is expected to handle various sizes of datasets.
     *  Each test should complete within 3 seconds
     */
    @Timeout(value = 3)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testDataProcessingWithTimeout(int datasetSize) throws InterruptedException {
        boolean isProcessedSuccessfully = processData(datasetSize);
        Assertions.assertTrue(isProcessedSuccessfully);
    }

    private boolean processData(int size) throws InterruptedException {
        Thread.sleep(size * 1000L);
        return true;
    }
}
