package com.mycompany.app;

import org.junit.Test;

public class AppUnitTest {
    @Test
    public void runThisTest() {
        System.err.println("Running runThisTest()!");
    }

    @Test
    public void runAnotherTest() {
        System.err.println("Running runAnotherTest()");
    }

    @Test
    public void longRunningTest() throws InterruptedException {
        System.err.println("Running a long running test....");
        SleepyDwarf dwarf = new SleepyDwarf();
        dwarf.sleep(10);
        System.err.println("Oh my, I took a long nap!");
    }
}
