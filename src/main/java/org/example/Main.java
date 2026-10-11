package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = 4;

            @Override
            public void run() {
                System.out.println("I'm a programmer");
                count--;
                if (count <= 0) {
                    System.out.println("Task ended");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 0, 2000);
    }
}