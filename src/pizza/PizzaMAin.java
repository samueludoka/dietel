package pizza;

import java.util.Scanner;

import static pizza.PizzaHut.*;


public class PizzaMAin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 for small box, 6 for medium box and 10 for large box: ");
        int boxSize = input.nextInt();

        System.out.println("enter number of super hungry persons: ");
        int superHungry = input.nextInt();
        System.out.println("enter number of normal hungry persons: ");
        int normalHungry = input.nextInt();
        System.out.println("enter number of classic hungry persons: ");
        int classicHungry = input.nextInt();

        int totalNumberOfHungryPersons = superHungry + normalHungry + classicHungry;

    }
}