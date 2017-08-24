package com.xes.live.core.ThreadLearn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by liuweishi on 2017/8/14.
 */
public class SychronizedLearn {
    private static volatile boolean stopRequested;
    private static final AtomicInteger nextInt= new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread backgroundThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int i = 0;
                    while (!stopRequested) {
                        System.out.println(nextInt());
                    }
                }
            });
            backgroundThread.start();
        }

        TimeUnit.SECONDS.sleep(1);
        stopRequested= true;
    }
    public static int nextInt(){
        return nextInt.getAndIncrement();
    }
}
