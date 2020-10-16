package com.mycompany.app;

public class SleepyDwarf {
    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
}
