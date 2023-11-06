package assignment.game;

import java.util.Scanner;

public class GameField {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Scanner scanner1  = new Scanner(System.in);
        Player player = new Player();

        System.out.println("please enter your first name ");
        String firstNameZ = scanner.nextLine();

        System.out.println("please enter your last name ");
        String lastNameZ = scanner.nextLine();

        System.out.println("please enter your middle name ");
        String middleNameZ = scanner.nextLine();

        System.out.println("please enter your age ");
       int age = scanner1.nextInt();

        System.out.println(player.registerNewPlayer(firstNameZ,lastNameZ, middleNameZ, age));

    }
}
