import java.util.Scanner;

public class Account22Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account22 account = new Account22();

        System.out.println("Enter deposit: ");
        int deposit = input.nextInt();
        account.deposit(deposit);

        System.out.println("Enter withdraw: ");
        int withdraw = input.nextInt();
        account.withdraw(withdraw);

        int checkBalance = deposit - withdraw;

        if(deposit >= withdraw) {
            System.out.println("success");
        }else {
            System.out.println("you r a criminal");
        }




        





    }

}



