package com.bl.day5;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= number / 2; i++) {
            if((number % i) == 0) {
                sum = sum + i;
            }
        }
        if(number == sum) {
            System.out.println("The number" + " " + number + " " + "is" + " " + "perfect number");
        }
        else {
            System.out.println("The number" + " " + number + " " + "is not" + " " + "perfect number");
        }
    }
}
