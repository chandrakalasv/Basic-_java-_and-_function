package com.bl.day5;

import java.util.Scanner;

public class BinaryToDecimal {
    static int swapNibbles(int num)
    {
        return ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int decimalNum = sc.nextInt();
        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println("Decimal to binary Converted number is " + binaryNum);
        int swapNum = swapNibbles(decimalNum);
        String swapBinaryNum = Integer.toBinaryString(swapNum);
        System.out.println("Swapped binary  number " + swapBinaryNum);
        System.out.println("Swapped decimal  number " + swapNum);
    }
}

