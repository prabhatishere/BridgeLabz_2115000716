package com.lcwd.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTest {
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testTimeout() {
        assertThrows(Exception.class, () -> longRunningTask());
    }
}
