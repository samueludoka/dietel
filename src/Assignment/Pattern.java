package Assignment;

public class Pattern {
    public static void main(String[] args) {
        int number = 6;
        for (int column = 1; column <= number; column++) {
            for (int row = 1; row <= column; row++) {
                System.out.print(row);
            }
            for (int gap = column; gap <= number; gap++){
                System.out.print("  ");
            }
            for (int shape = 1; shape <= column; shape++){
                System.out.print(shape);
            }
            System.out.println("  ");
        }

    }
}