package org.example;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown {

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to count down from: ");
        int response = scanner.nextInt();

        scanner.close();
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy new year");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 0, 1000);
    }
}
