package tic_tac_toe;

import java.util.Scanner;

public class TicMain {
    static TicToe ticToe = new TicToe();
    static Player player = new Player(TicToeSigns.X);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        playerNames();
        play();
    }

    public static void playerNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player1 enter ur name: ");
        String player1 = input.nextLine();
        ticToe.getPlayers()[0].setName(player1);
        System.out.println("Player1 enter ur name: ");
        String player2 = input.nextLine();
        ticToe.getPlayers()[1].setName(player2);
    }

    public static void gameBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int C = 0; C < 3; C++) {
                System.out.print(" | ");
                System.out.print(ticToe.getBoard()[i][C]);
            }
        }
    }

    public static void play() {
        while (ticToe.isGameContinue()) {
            for (int i = 0; i < 2; i++) {
                gameBoard();
                System.out.println("\n" + ticToe.getPlayers()[i].getName() + " enter your move number");
                int move = scanner.nextInt();
                ticToe.play(ticToe.getPlayers()[i], move);
                if (!ticToe.isGameContinue()) {
                    break;
                }
            }
        }
        if (ticToe.draw()) {
            System.out.println("It is a draw");
        } else if (ticToe.winner() != null) {
            System.out.println( ticToe.winner().getName() + " is the winner");
        }
    }
}


