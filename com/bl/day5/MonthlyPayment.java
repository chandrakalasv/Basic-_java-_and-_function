package com.bl.day5;

import java.util.Scanner;

public class MonthlyPayment {
    public static double paymentCalculation(double principalLoanAmt, double rateOfInterest, int year ) {
        double interestPerMonth = (rateOfInterest / (12 * 100));
        double noOfMonths = 12 * year;
        return (principalLoanAmt * interestPerMonth) / (1 - Math.pow((1 + interestPerMonth), (-noOfMonths)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values to calculate monthly payment");
        System.out.println("enter principal loan amount");
        double principalLoanAmt = sc.nextDouble();
        System.out.println("enter rate of interest");
        double rateOfInterest = sc.nextDouble();
        System.out.println("enter year to payoff");
        int year = sc.nextInt();
        double payment = paymentCalculation(principalLoanAmt, rateOfInterest, year);
        System.out.println("the monthly payment is" + " " + payment);
    }
}
