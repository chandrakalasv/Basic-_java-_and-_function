package com.bl.day5;

import java.util.Scanner;
public class deDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number: ");
        int decimal = sc.nextInt();
        convertToBinary(decimal);
    }
    public static void convertToBinary(int num) {
        String binary = Integer.toBinaryString(num);
        switch (binary.length() % 8) {
            case 0: System.out.println(binary); break;
            case 1: System.out.println("0000000" + binary); break;
            case 2: System.out.println("000000" + binary); break;
            case 3: System.out.println("00000" + binary); break;
            case 4: System.out.println("0000" + binary); break;
            case 5: System.out.println("000" + binary); break;
            case 6: System.out.println("000" + binary); break;
            case 7: System.out.println("00" + binary); break;
            case 8: System.out.println("0" + binary); break;
        }
    }
}
