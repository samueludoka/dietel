package archeryGame;

import java.security.SecureRandom;
public class ArcheryGame {




        private final Player[] players = new Player[4];

        private final int[][] scoreBoard = new int[4][3];


        public ArcheryGame(){
            emptyCellsFor(scoreBoard);
            players[0] = new Player(1);
            players[1] = new Player(2);
            players[2] = new Player(3);
            players[3] = new Player(4);
        }
        public Player[] getPlayers(){
            return players;
        }


        public int[][] getScoreBoard() {
            return scoreBoard;
        }


        private static void emptyCellsFor(int[][] scoreBoard){
            for (int row = 0; row < scoreBoard.length; row++) {
                for (int column = 0; column < scoreBoard[row].length; column++) {
                    scoreBoard[row][column] = -1;
                }
            }
        }

        public static int generateScore(){
            SecureRandom random = new SecureRandom();
            int score = random.nextInt(0,11);
            return score;
        }
    }

