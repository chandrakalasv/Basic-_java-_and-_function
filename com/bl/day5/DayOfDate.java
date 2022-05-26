package com.bl.day5;

import java.util.Scanner;

public class DayOfDate {
    public static int dayOfWeek (int day, int month, int year) {
       int y0 = year - ((14 - month) / 12);
       int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
       int m0 = month + 12 * ((14 - month) / 12) - 2;
       return (day + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in dd format");
        int day = sc.nextInt();
        System.out.println("Enter the month in mm format");
        int month = sc.nextInt();
        System.out.println("Enter the year in yyyy format");
        int year = sc.nextInt();
        int dayNo = dayOfWeek(day, month, year);
            switch(dayNo) {
                case 0: System.out.println("The day is sunday"); break;
                case 1: System.out.println("The day is monday"); break;
                case 2: System.out.println("The day is tuesday"); break;
                case 3: System.out.println("The day is wednesday"); break;
                case 4: System.out.println("The day is thursday"); break;
                case 5: System.out.println("The day is friday"); break;
                case 6: System.out.println("The day is saturday"); break;
            }
    }
}
