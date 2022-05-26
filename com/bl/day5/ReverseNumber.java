package com.bl.day5;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number");
        int inputNumber = sc.nextInt();
        int reminder = 0;
        int reverseNumber = 0;
        while(inputNumber != 0) {
            reminder = inputNumber % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            inputNumber = inputNumber / 10;
        }
        System.out.println("The reversed number is" + " " + reverseNumber);
    }
}
