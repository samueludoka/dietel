package chapter4Exercises;

public class CheckBoardAsterisks {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
            for (int b = 0; b < 8; b++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
