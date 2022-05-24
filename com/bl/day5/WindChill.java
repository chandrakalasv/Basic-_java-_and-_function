package com.bl.day5;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t value ");
        double t = sc.nextDouble();
        System.out.println("Enter v value");
        double v = sc.nextDouble();
        if (t < 50 && (v < 120) && (v > 3)) {
            double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
            System.out.println("temperature is" + " " + t);
            System.out.println("wind speed is" + " " + v);
            System.out.println("wind chill is" + " " + w);
        }
    }
}
