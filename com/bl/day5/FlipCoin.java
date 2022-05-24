package com.bl.day5;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin");
        int number = sc.nextInt();
        for(int i=0; i < number; i++) {
            double check = Math.random();
            System.out.println(check);
            if(check < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("number of head is" + " " + head);
        System.out.println("number of tail is" + " " + tail);
        int percentage =  ((head * 100) / number);
        System.out.println("percentage of head is" + " " + percentage);
        int percentage1 =  ((tail * 100) / number);
        System.out.println("percentage of head is" + " " + percentage1);
    }
}
