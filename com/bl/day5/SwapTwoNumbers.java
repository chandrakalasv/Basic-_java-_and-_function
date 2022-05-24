package com.bl.day5;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the first number");
        int num2 = sc.nextInt();
        System.out.println("before interchanging numbers are" + " " + num1 + " " + "and" + " " + num2);
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after interchanging numbers are" + " " + num1 + " " + "and" + " " + num2);
    }
}
