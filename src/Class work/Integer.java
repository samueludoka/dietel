import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number");
        int x = input.nextInt();
        System.out.print("Enter second Integer");
        int y = input.nextInt();
        System.out.print("Enter third Integer");
        int z = input.nextInt();
        int result = x + y + z;
        System.out.printf("Product of %d%n", result);
    }
}