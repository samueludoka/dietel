package chapter4Exercises;

public class PattrenSkAssignment {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            System.out.println();
            for (int column = 0; column < row + 1; column++) {
                System.out.print("* ");

            }

        }
        for (int row = 0; row < 5; row++) {
            System.out.println();
            for (int column = 0; column <3 - row + 1; column++) {
                System.out.print("* ");

            }

        }
    }
}
