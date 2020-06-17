package com.abeek.thread.tutorials;

import com.abeek.thread.tutorials.tasks.Task4;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        System.out.println("STARTED " + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId());

        //create CountDownLatch
        CountDownLatch latch = new CountDownLatch(4);

        //create 4 threads
        Thread task1 = new Thread(new Task4("task_1", latch));
        Thread task2 = new Thread(new Task4("task_2", latch));
        Thread task3 = new Thread(new Task4("task_3", latch));
        Thread task4 = new Thread(new Task4("task_4", latch));

        //start tasks
        task1.start();
        task2.start();
        task3.start();
        task4.start();

        //wait for the above threads to complete
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISHED " + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId());
    }
}
