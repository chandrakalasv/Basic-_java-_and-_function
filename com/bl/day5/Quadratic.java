package com.bl.day5;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value ");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        double delta = ((b * b) - (4 * a * c));
        if (delta > 0) {
            double root1 =(((-b) + Math.sqrt(delta))/ (2 * a));
            double root2 =(((-b) - Math.sqrt(delta))/ (2 * a));
            System.out.println("root1 value is" + " " + root1);
            System.out.println("root2 value is" + " " + root2);
        }
        else if(delta == 0) {
            double root1 = (-b) / (2 * a);
            double root2 = (-b) / (2 * a);
            System.out.println("root1 value is" + " " + root1);
            System.out.println("root2 value is" + " " + root2);
        }
        else if (delta < 0) {
            double imaginary_root = Math.sqrt(-delta) / (2 * a);
            double real_root = (-b) / (2 * a);
            System.out.println("root1 is"+ " " + real_root + " + " + imaginary_root + "i");
            System.out.println("root2 is" + " " + real_root + " _ " + imaginary_root + "i");
        }
    }
}
