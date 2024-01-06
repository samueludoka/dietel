package bankAccount;

import java.util.Scanner;

public class BankApp {
   static Bank gtbBank = new Bank("GtBank");
   private Account myAccount;

    public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu() {
        System.out.println("""
                ===================================================
                            WELCOME TO GTBANK
                ===================================================
                dear esteemed customer how may we serve you,press
                1. -> To Register An Account.
                2. -> To deposit in Your Account.
                3. -> To Withdraw from Your Account.
                4. -> To Transfer.
                5. -> To check Balance.
                6. -> To Exit
                ===================================================
                ===================================================
                              
                """);
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1 -> RegisterAnAccount();
            case 2 -> depositInAccount();
            case 3 -> withdrawFromYourAccount();
            case 4 -> gtbBankTransfer();
            case 5 -> checkBalance();
            case 6 -> System.exit(0);
            default -> {
                System.out.println("Error\nChoose between 1-5");mainMenu();}
        }

    }
    public static void RegisterAnAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("enter last Name: ");
        String lastName = input.nextLine();
        System.out.println("enter pin");
        String pin = input.nextLine();
        Account account = gtbBank.createAccountFor(firstName, lastName, pin);
        System.out.println("Registered Successful\n"+"Account Number is : "+account.getAccountNumber());
        mainMenu();

    }
    public static void depositInAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter account number: ");
        String accountNumber = input.nextLine();
        System.out.println("enter amount to be deposited: ");
        int amount = input.nextInt();
        try {
        gtbBank.deposit(amount, accountNumber);
        System.out.println("deposited successful\n"+ gtbBank.findAccount(accountNumber) );
        mainMenu();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            mainMenu();
        }
    }
    public static void withdrawFromYourAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.println("enter pin");
        String pin = input.nextLine();
        System.out.println("Enter amount: ");
        int amount = input.nextInt();
        try {
            gtbBank.withdraw(amount, accountNumber, pin);
            System.out.println("withdraw successful\n"+ gtbBank.findAccount(accountNumber) );
            mainMenu();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            mainMenu();
        }

    }
    public static void gtbBankTransfer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter own account number");
        String accountNumber = input.nextLine();
        System.out.println("Enter Receiver's account number: ");
        String ReceiverNumber = input.nextLine();
        System.out.println("Enter pin: ");
        String pin = input.nextLine();
        System.out.println("Enter amount to be transferred: ");
        int amount = input.nextInt();
        try {
            gtbBank.transfer(amount, accountNumber, ReceiverNumber, pin);
            System.out.println("transfer successful\n"+ gtbBank.findAccount(accountNumber) );
            mainMenu();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            mainMenu();
        }
    }
    public static void checkBalance() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pin: ");
        String pin = input.nextLine();
        mainMenu();
    }
}
