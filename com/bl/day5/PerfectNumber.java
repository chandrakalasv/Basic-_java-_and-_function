package com.bl.day5;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= inputNumber / 2; i++) {
            if((inputNumber % i) == 0) {
                sum = sum + i;
            }
        }
        if(inputNumber == sum) {
            System.out.println("The number" + " " + inputNumber + " " + "is perfect number");
        }
        else {
            System.out.println("The number" + " " + inputNumber + " " + "is not perfect number");
        }
    }
}
