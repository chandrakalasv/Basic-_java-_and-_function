package com.bl.day5;

import java.util.Scanner;

public class SqrtNewtonMethod {
    static double squareRootMethod(double inputNumber) {
        double t = inputNumber;
        double epsilon = 1e-15;
        while((Math.abs(t - inputNumber / t)) > (epsilon * t)) {
            t = (inputNumber / t + t) / 2.0;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the non-negative number");
        double inputNumber = sc.nextDouble();
        double result = squareRootMethod(inputNumber);
        System.out.println("square root of a number is" + " " + result);
    }
}
