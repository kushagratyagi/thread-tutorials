package com.abeek.thread.tutorials.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 implements Runnable {
    private String threadName;

    public Task3(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for" + " task name=" + threadName + " = " + ft.format(d));
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " + threadName + " = " + ft.format(d));
                }
                Thread.sleep(1000);
            }
            System.out.println(threadName + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
