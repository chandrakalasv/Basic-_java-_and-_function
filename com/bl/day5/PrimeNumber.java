package com.bl.day5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= number/2; i++) {
            if ((number % i) == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The number" + " " + number + " " + "is prime number");
        }
        else {
            System.out.println("The number" + " " + number + " " + "is not prime number");
        }
    }
}
