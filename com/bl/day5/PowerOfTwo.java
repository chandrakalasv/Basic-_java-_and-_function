package com.bl.day5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power value of N");
        int n = sc.nextInt();
        int i = 0;
        int power_of_two = 1;
        while(i <= n) {
            System.out.println("2 power" + " " + i + " is " + power_of_two);
            power_of_two = 2 * power_of_two;
            i++;
        }
    }
}
