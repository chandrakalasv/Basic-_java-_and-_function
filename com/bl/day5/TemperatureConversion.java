package com.bl.day5;

import java.util.Scanner;

public class TemperatureConversion {

    public static double toFahrenheit (double inputInCelsius) {
        return (inputInCelsius * (9.0 / 5.0) + 32);
    }
    public static double toCelsius (double inputInFahrenheit) {
        return ((inputInFahrenheit - 32) * (5.0 / 9.0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option");
        System.out.println("1.To covert temperature from fahrenheit to Celsius");
        System.out.println("2.To covert temperature from  Celsius to fahrenheit");
        int option = sc.nextInt();
        switch(option) {
            case 1: {
                System.out.println("Enter Fahrenheit temperature");
                double inputInFahrenheit = sc.nextDouble();
                double outputInCelsius = toCelsius(inputInFahrenheit);
                System.out.println("Temperature converted from fahrenheit " + inputInFahrenheit + " to celsius " + outputInCelsius);
                break;
            }
            case 2: {
                System.out.println("Enter celsius temperature");
                double inputInCelsius = sc.nextDouble();
                double outputInFahrenheit = toFahrenheit(inputInCelsius);
                System.out.println("Temperature converted from celsius " + inputInCelsius + " to fahrenheit " + outputInFahrenheit);
                break;
            }
        }
    }
}
