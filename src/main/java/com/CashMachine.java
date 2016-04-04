package com;

import java.util.Scanner;

/**
 * Created by coura on 03.04.2016.
 */

public abstract class CashMachine {
    private static int balance;

    public static int showBalance() {
        return balance;
    }

    public static int inputMoney() {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        return money;
    }

    public static int takeMoney(int money) {
        return balance + money;
    }

    public static int giveMoney(int money) {
        return balance - money;
    }

    public static boolean isInteger(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
