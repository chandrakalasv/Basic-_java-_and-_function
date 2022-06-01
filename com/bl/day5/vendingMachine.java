package com.bl.day5;

import java.util.Scanner;

public class vendingMachine {
    public static int runMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPlease enter your selection:\n 1: Snickers \t 125\n2: Dairy milk \t 130\n3: almond treat \t 150\n4: Pepsi \t 185\n5: Exit ");
        int choice = keyboard.nextInt();
        if (choice == 5) {
            throw new RuntimeException("\n \n you did not selected any item\n\n");
        } else {
            return choice;
        }
    }

    public static int retrievePrice(int menuChoice) {
        if (menuChoice == 1) {
            return 125;
        } else if (menuChoice == 2) {
            return 130;
        } else if (menuChoice == 3) {
            return 150;
        } else {
            return menuChoice == 4 ? 185 : 0;
        }
    }

    public static int moneyInserted(int price) {
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Your item costs: " + price + " Please enter the amount of money:");

        for(money = keyboard.nextInt(); money < price; money += keyboard.nextInt()) {
            System.out.println("Please insert sufficient funds");
        }

        return money - price;
    }

    public static void changeOut(int change) {
        int thousand = 0;
        int five_Hundred = 0;
        int hundred = 0;
        int fifty = 0;
        int twentyFive = 0;
        int ten = 0;

        int five;
        for(five = 0; change >= 1000; change -= 1000) {
            ++thousand;
        }

        while(change >= 500) {
            ++five_Hundred;
            change -= 500;
        }

        while(change >= 100) {
            ++hundred;
            change -= 100;
        }

        while(change >= 50) {
            ++fifty;
            change -= 50;
        }

        while(change >= 25) {
            ++twentyFive;
            change -= 25;
        }

        while(change >= 10) {
            ++ten;
            change -= 10;
        }

        while(change >= 5) {
            ++five;
            change -= 5;
        }

        System.out.printf("\nHere's your change:\n %d thousand, %d five_Hundred, %d hundred,  %d fifty, %d twentyFive, %d ten , %d five and %d rupees", thousand, five_Hundred, hundred, fifty, twentyFive, ten, five, change);
    }

    public static void main(String[] args) {
        int food = runMenu();
        int price = retrievePrice(food);
        int change = moneyInserted(price);
        changeOut(change);
    }
}

