package com.bl.day5;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decimalNum = sc.nextInt();
        int[] binaryNum = new int[1000];
        int count = 0;
        int i = 0;
        while (decimalNum > 0) {
            binaryNum[++i] = (decimalNum % 2);
            decimalNum = decimalNum / 2;
            count++;
        }
        for(i = count; i > 0; i--) {
            System.out.print(binaryNum[i]);
        }
    }
}
