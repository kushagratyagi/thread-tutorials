package com.abeek.thread.tutorials;

import com.abeek.thread.tutorials.tasks.Task1;

public class ThreadDemo {
    public static void main(String[] args) {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Task1 task = new Task1("thread_" + i);

            //start() method creates a new Thread and code inside run() method is executed in new Thread
            // while if we call run() method directly no new Thread is created and code inside run() will execute on current Thread.
            task.start();
        }
    }
}

