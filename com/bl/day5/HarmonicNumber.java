package com.bl.day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the harmonic value N");
        double n = sc.nextDouble();
        double harmonic = 0;
        for(double i = 1; i <= n; i++) {
            harmonic = harmonic + (1/i);
        }
        System.out.println(n + " " + "harmonic number is" + " " + harmonic);
    }
}
