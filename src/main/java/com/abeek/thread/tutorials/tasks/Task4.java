package com.abeek.thread.tutorials.tasks;

import java.util.concurrent.CountDownLatch;

public class Task4 implements Runnable {
    private CountDownLatch latch;

    public Task4(String threadName, CountDownLatch latch) {
        Thread.currentThread().setName(threadName);
        this.latch = latch;
    }

    public void run() {
        System.out.println("STARTED " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ERROR " + Thread.currentThread().getName() + ", message=" + e.getMessage());
        }
        System.out.println("FINISHED " + Thread.currentThread().getName());
        latch.countDown();
    }
}
