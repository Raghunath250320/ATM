package com.java.atmProject;

import java.util.*;

public class Atm {
  static  Atm a1 = new Atm();
    Bank b = new Bank(123, "Sbi", 200000, "Hyd", 2, 505172, "Raghunath");
    static Scanner scan = new Scanner(System.in);

    public void Withdraw(double amt) {
        if (amt < b.bankBalance) {
            b.bankBalance -= amt;
            System.out.println("Withdraw successfully");
            balance();
        } else {
            System.out.println("Insufficient funds in your " + b.bankName);
            System.out.println( b.bankpersonName + " your balance is " + b.bankBalance);
        }
        choice();
    }

    public void deposit(double amt) {
        b.bankBalance += amt;
        System.out.println("Amount credited successfully");
        choice();
    }

    public void changePin(int newpin) {
        if (newpin != b.bankPin) {
            System.out.println("Enter the pin once again");
            int n = scan.nextInt();
            if (newpin == n) {
                b.bankPin = newpin;
                System.out.println("Pin changed successfully");
            } else {
                System.out.println("Invalid entry");
            }
        } else {
            System.out.println("You have entered the old pin");
        }
        choice();
    }

    public void choice() {
        System.out.println("Press 1 to continue");
        System.out.println("Press any key to exit");
        String s = scan.next();
        if (s.equals("1")) {
            main(null);
        } else {
            return;
        }
    }

    public void balance() {
        System.out.println("Heyyy___" + b.bankName);
        System.out.println("Your current account balance is:");
        System.out.println(b.bankBalance + " rupees");
        choice();
    }

    public static void main(String[] args) {
        System.out.println("ATM");
        System.out.println("*************");
        System.out.println("1 for withdraw");
        System.out.println("2 for deposit");
        System.out.println("3 for change pin");
        System.out.println("4 for check balance");

        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter the amount:");
                double amt = scan.nextDouble();
                a1.Withdraw(amt);
                break;

            case 2:
                System.out.println("Enter the amount:");
                double amt1 = scan.nextDouble();
                a1.deposit(amt1);
                break;

            case 3:
                System.out.println("Enter the new pin:");
                int newpin = scan.nextInt();
                a1.changePin(newpin);
                break;

            case 4:
                a1.balance();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}


