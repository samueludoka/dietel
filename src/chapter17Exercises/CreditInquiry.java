package chapter17Exercises;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        MenuOption accountType = getRequest(input);

        while (accountType != MenuOption.END){
            switch (accountType){
                case ZERO_BALANCE :
                    System.out.printf("%nAccounts with zero balances: %n");
                    break;
                case CREDIT_BALANCE:
                    System.out.println("%nAccounts with credit balances: %n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances: %n");
                    break;
            }
            readRecords(accountType);
            accountType = getRequest(input);

        }
    }



    private static MenuOption getRequest(Scanner input) {
        int request = 4;

        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program");

        try {
            do {
                System.out.printf("%n? ");
                request = input.nextInt();
            }while ((request < 1) || (request > 4));
        }
        catch(NoSuchElementException noSuchElementException){
            System.out.println("Invalid input. Terminating.");
        }
        return choices [request - 1];
    }
    private static void readRecords(MenuOption accountType) throws IOException {
        try(Scanner input = new Scanner(Paths.get("clients.txt"))){
            while (input.hasNext()){
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                
                if(shouldDisplay(accountType, balance)){
                    System.out.printf("%-10d%-12s%10.2f%n", accountNumber,firstName, lastName, balance);
                    
                }
                else{
                    input.nextLine();
                }
            }
        }
        catch (NoSuchElementException |IllegalStateException| IOException e){
            System.out.println("Error processing file, Terminating.");
            System.exit(1);
        }
    }

    private static boolean shouldDisplay(MenuOption option, double balance) {
        if((option == MenuOption.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((option == MenuOption.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else if ((option == MenuOption.ZERO_BALANCE) && (balance == 0)) {
            return true;

        }
        return false;
    }
}
