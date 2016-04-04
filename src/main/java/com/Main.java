package com;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by coura on 03.04.2016.
 */

public class Main extends CashMachine {

    private static int balance = 100;

    public static void main(String[] args) throws IOException {

        System.out.println("Ваш баланс: " + showBalance());
        System.out.println("Введите сумму: ");
        int summ = inputMoney();

//        System.out.println("Снятие средств: " + takeMoney(summ));

        System.out.println("Пополнение баланса: " + giveMoney(summ));


    }

    public static int showBalance() {
        return balance;
    }

    public static int inputMoney() {
            Scanner scanner = new Scanner(System.in);
            String sMoney = scanner.next();

        if (isInteger(sMoney)) {
            int money = Integer.parseInt(sMoney);
            if (money > 0) {
                return money;
            }
        } else try {
                throw new IOException(sMoney);
            } catch (IOException e) {
                System.out.println("[Error] Вы ввели херню!");
                System.out.println("Необходимо ввести положительное целое число.");
            }
        return 0;
        }


    public static int takeMoney(int sum) {
        if (sum > balance){
            System.out.println("Для снятия средства сумма должа быть меньше равна текущему балансу!");
        }
        if (sum % 10 != 0){
            System.out.println("Для снятия средств сумма должна быть кратна 10.");
        }
        if ((sum <= balance) && (sum % 10 == 0)){
            balance -= sum;
        }
        return balance;
    }

    public static int giveMoney(int sum) {
        if (sum % 10 == 0) {
            balance += sum;
        } else {
            System.out.println("Для пополнения баланса сумма должна быть кратна 10.");
        }
        return balance;
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
