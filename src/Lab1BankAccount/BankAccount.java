package Lab1BankAccount;

import java.util.Scanner;

public class BankAccount {
    int AccountNum;


    public static void displayMenu() {
        System.out.println("1. Withdraw funds");
        System.out.println("2. Deposit funds");
        System.out.println("3. Display account info");
        System.out.println("4. Exit");
    }
    public static double WithdrawFunds(double amo){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw from the account: ");
        double with = input.nextDouble();
        amo = amo - with;
        return amo;
    }
    //public static double DepositFunds
    //public static void displayInfo

    public static void main(String[] args) {
        double amount = 0;
        double withdraw = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank Account");
        System.out.println("Please enter the name for the account:");
        String in = input.next();
        System.out.println("Would you like to deposit money?");
        String i = input.next();
        if (i.equals("Y")) {
            System.out.println("Please enter the amount you want to deposit: ");
            amount = input.nextInt();
        } else if (i.equals("N")) {
            amount = 0;
        } else {
            System.out.println("Invalid choice");
        }
        displayMenu();
        System.out.println("Please enter your Choice: ");
        int UserChoice = input.nextInt();

        while (UserChoice != 4) {
            switch (UserChoice) {
                case 1:
                    if (amount <= 0) {
                        System.out.println("There is no money in the account!");
                        UserChoice=4;
                    } else {
                        WithdrawFunds(amount);
                        System.out.println("New balance is: " + WithdrawFunds(amount));

                    }

            }
        }
    }
}
