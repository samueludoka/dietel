package archeryGame;

import static archeryGame.ArcheryGame.generateScore;

public class Player {

        private int id;
        private String name;


        public int getId(){
            return id;
        }

        public Player(int id){
            this.id=id;
        }

        public Integer play(int[][] scoreBoard) {
            int[] playerRow = scoreBoard[id-1];
            if (playerRow[playerRow.length-1]!=-1) throw new RuntimeException(
                    "player has had 3 turns and as such, is not allowed to play anymore"
            );
            int score = generateScore();
            recordScore(playerRow, score);
            return score;
        }


        private static void recordScore(int[] playerRow, int score){
            for (int index = 0; index < playerRow.length; index++) {
                if (playerRow[index]==-1){
                    playerRow[index] = score;
                    break;
                }
            }
        }

    }

