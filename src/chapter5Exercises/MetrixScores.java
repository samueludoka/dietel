package chapter5Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MetrixScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] sales = {{1500, 1200, 200}, {1150, 750, 720}, {8000, 1200, 135}, {200, 120, 122}};

        for (int i = 0; i < sales.length; i++) {
            System.out.println();
            for (int j = 0; j < sales[i].length; j++) {
                System.out.println("Enter sales for customer " + (i + 1));
                int input1 = scanner.nextInt();
                sales[i][j] = input1;
            }
        }
        System.out.printf("""
                    ITEM1           ITEM2           ITEM3
                    %d              %d              %d
                    %d              %d              %d
                    %d              %d              %d
                    %d              %d              %d
                """, sales[0][0], sales[0][1], sales[0][2], sales[1][0], sales[1][1], sales[1][2], sales[2][0], sales[2][1], sales[2][2], sales[3][0], sales[3][1], sales[3][2]);


        System.out.println(Arrays.deepToString(sales));
        for (int x = 0; x < sales.length; x++) {
            for (int y = 0; y < sales[x].length; y++) {
                System.out.printf("Customer  %d %d\n",  y, sales[x][y]);
            }
            System.out.println();
        }

    }
}

