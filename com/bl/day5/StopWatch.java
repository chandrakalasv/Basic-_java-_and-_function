package com.bl.day5;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long lagTime = 0;
        for (int i = 0; i < 1000000000; i++) {
            lagTime += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("the elapsed time is" + " " + elapsedTime);
    }
}
