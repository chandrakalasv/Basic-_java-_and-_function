package com.bl.day5;

import java.util.Scanner;

public class CouponNumbers {
    public static int distinctCouponCollection(int couponNumber) {
        boolean[] isCollected = new boolean[couponNumber];
        int count = 0;
        int distinctNumber = 0;
        while (distinctNumber < couponNumber) {
            int generatedCouponNum = (int) (Math.random() * 10) % couponNumber;
            count++;
            if (!isCollected[generatedCouponNum]) {
                distinctNumber++;
                isCollected[generatedCouponNum] = true;
                System.out.println("distinct coupon number is " + generatedCouponNum);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate distinct coupon");
        int couponNumber = sc.nextInt();
        int totalRandomNumber = distinctCouponCollection(couponNumber);
        System.out.println("total random numbers generated to get distinct coupon is" + " " + totalRandomNumber);
    }
}

