package com.bl.day5;

import java.util.Scanner;

public class LargestAmong3Numbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Enter the third number");
            int num3 = sc.nextInt();
            int largest;
            largest = num1;
            if(num2 > largest) {
                largest = num2;
            }
            if(num3 > largest) {
                largest = num3;
            }
        System.out.println("the largest among 3 numbers is" + " " + largest);

    }
}
