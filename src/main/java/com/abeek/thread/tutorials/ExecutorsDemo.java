package com.abeek.thread.tutorials;

import com.abeek.thread.tutorials.tasks.Task3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    private final static int MAX_POOL = 3;
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(MAX_POOL);

        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            Task3 task = new Task3("thread_" + i);
            pool.execute(task);
        }

        pool.shutdown();
    }
}

