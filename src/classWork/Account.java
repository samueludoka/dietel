package assignment;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    public  void Account(){
        System.out.println("""
                1 -> Transfer
                """);
        int options = input.nextInt();
        switch (options){
            case 1 -> Transfer();
        }
    }

    private void Transfer() {
        System.out.println("""
                1 -> put account number
                2 -> put amount
                3 -> Go back to Account
                """);
        int response = input.nextInt();
        switch (response) {
            case 1 -> {
                System.out.println("Enter account number");
                int number = input.nextInt();
            }
            case 2 -> {
                System.out.println("Enter an amount");
                int amount = input.nextInt();
            }
            case 3 -> Account();
        }
    }
}
