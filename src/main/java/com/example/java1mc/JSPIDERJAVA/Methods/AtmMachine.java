package com.example.java1mc.JSPIDERJAVA.Methods;

import java.util.Scanner;

public class AtmMachine {



    public static double balance = 10000;
    public static double withdraw,deposit,check;

    public static   Scanner sc = new Scanner(System.in);


    public static void depositMoney(){

        System.out.println("Current balance: "+balance+" \u20B9 \n");

        System.out.println("enter the amount to be deposit in rupees \u20B9");

        deposit = sc.nextDouble();
        balance = balance+deposit;
        System.out.println("Money deposited successfully ");
        System.out.println("updated balance: "+balance +" \u20B9");


    }

    public static void withDrawMoney() {
        System.out.println("enter the amount you want to withdraw in rupees \u20B9");
        withdraw = sc.nextDouble();

        System.out.println("Current balance: "+balance+" \u20B9 \n");

        balance = balance-withdraw;
        System.out.println("money withdrawn succcessfully");

        System.out.println("remaining balance: "+balance+" \u20B9 \n");


    }
    public static void checkBalance() {

        System.out.println("Current balance: "+balance+" \u20B9 \n");

    }
    public static void main(String[] args) {

        System.out.println("-----------WELCOME TO AUTOMATED TELLER MACHINE---------\n");

        char p;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("    enter 1 for deposit money");
            System.out.println("    enter 2 for withdraw money");
            System.out.println("    enter 3 for check balance");
            System.out.println("-------------------------------------------------------");


            int choose = sc.nextInt();;

            switch (choose){
                case 1: depositMoney();
                break;
                case 2: withDrawMoney();
                break;
                case 3:checkBalance();
                break;
            }

            System.out.println("enter Y/y to continue or any other key to stop ");
            p = sc.next().charAt(0);

        } while (p=='Y'||p=='y');

        System.out.println("Thank You!Program ends here!!");
    }

}
