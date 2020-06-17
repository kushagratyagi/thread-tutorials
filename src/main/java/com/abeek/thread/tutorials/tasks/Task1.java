package com.abeek.thread.tutorials.tasks;

public class Task1 extends Thread {
    private String threadName;

    public Task1(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Running threadName=" + threadName + ", Id=" + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in thread=" + threadName + ", message=" + e.getMessage());
        }
    }
}
