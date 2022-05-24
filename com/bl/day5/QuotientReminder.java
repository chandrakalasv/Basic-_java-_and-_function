package com.bl.day5;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the first number");
        int num2 = sc.nextInt();
        int quotient = (num1 / num2);
        int reminder = (num1 % num2);
        System.out.println("the quotient of " + num1 + "and" + num2 + " " + "is" + quotient);
        System.out.println("the reminder of " + num1 + "and" + num2 + " " + "is" + reminder);
    }

}
