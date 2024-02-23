package chapter15Exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileTxt {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("Clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", "Enter end-of-line indicator to end input. ");

            while (input.hasNext()) {
                try {
                    output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
                }
                catch (NoSuchElementException elementException) {
                    System.err.println("invalid input. pls try again,");
                    input.nextLine();
                }
                System.out.println("? ");
            }
        }

        catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();

        }
    }
}
