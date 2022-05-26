package com.bl.day5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit for fibonacci series");
        int number = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        System.out.print("fibonacci series is" + " " + firstNum + " " + secondNum);
        for(int i = 3; i <= number; i++) {
            sum = firstNum + secondNum;
            System.out.print(" " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
