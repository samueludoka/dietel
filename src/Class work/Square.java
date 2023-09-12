import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number =  scanner.nextInt();
        int lan = number * number;
        System.out.printf("square of %d is %d", number,lan);

    }
}
