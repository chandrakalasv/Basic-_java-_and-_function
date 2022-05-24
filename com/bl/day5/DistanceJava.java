package com.bl.day5;

import java.util.Scanner;

public class DistanceJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value ");
        int x = sc.nextInt();
        System.out.println("Enter y value");
        int y = sc.nextInt();
        double distance = Math.sqrt((x * x) + (y * y));
        System.out.println("the distance is" + " " + distance);
    }
}
