package archeryGame;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArcheryGameTest {




        @Test
        public void testThatThereAreFourPlayersInTheGame(){
            ArcheryGame archeryGame = new ArcheryGame();
            Player[] players = archeryGame.getPlayers();
            assertNotNull(players);
            assertEquals(4, players.length);

        }

        @Test
        public void testThatPlayerCanPlayGame(){
            ArcheryGame archeryGame = new ArcheryGame();
            Player[] players = archeryGame.getPlayers();

            Player playerOne = players[0];
            int score =  playerOne.play(archeryGame.getScoreBoard());
            boolean isValidPlayerScore = score >= 0 && score <= 10;
            assertTrue(isValidPlayerScore);
        }

        @Test
        public void testThatTheGameAllows_3_Tries(){
            ArcheryGame archeryGame = new ArcheryGame();
            Player[] players = archeryGame.getPlayers();
            simulateGame(archeryGame);
            Player playerOne = players[0];
            assertThrows(RuntimeException.class, ()-> playerOne.play(archeryGame.getScoreBoard()));
        }


        private static void simulateGame(ArcheryGame game){
            Player[] players = game.getPlayers();
            for (int count = 0; count < 3; count++) {
                for (int index = 0; index < players.length; index++) {
                    Player player = players[index];
                    player.play(game.getScoreBoard());
                }
            }
        }

    }

