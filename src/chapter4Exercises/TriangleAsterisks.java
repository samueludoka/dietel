package chapter4Exercises;

public class TriangleAsterisks {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            System.out.println();

            for (int column = 0; column < row + 1; column++) {
                System.out.print("* ");
            }
        }
        System.out.println("\n");
        for (int count = 11; count >= 0; count--) {
            System.out.println();
            for (int j = 0; j < count - 1; j++) {
                System.out.print("* ");

            }

        }
        for (int count = 0; count < 10; count++) {
            for (int j = 1; j < count + 1; j++)
                System.out.print(" ");
            for (int i = 10; i > count; i--)
                System.out.print("* ");
            System.out.println();


        }
        for (int count = 10; count >  0; count--) {
            for (int j = 0; j < count - 1; j++)
                System.out.print(" ");
            for (int k = 10; k > count - 1; k--)
                System.out.print("* ");
            System.out.println();

            }


        }
    }

