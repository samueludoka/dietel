package assignment;

public class NewAsterisks {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
        }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println();
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }

        }

        }
    }

