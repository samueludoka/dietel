package tic_tac_toe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicToeTest {
    TicToe ticToe;
    Player player;
    @BeforeEach
    public void startEachTestWith(){
        ticToe = new TicToe();
        player = new Player(TicToeSigns.X);
    }
  
    @Test
    public void testThatGameBoardExistAndIsEmpty(){

        assertTrue(ticToe.isEmpty());
    }
    @Test
    public void testThatWhenAPlayerPlayIsNotEmpty(){
        Player[] players = ticToe.getPlayers();
        ticToe.markBoard(players[0], 3);
        assertFalse(ticToe.isEmpty());
    }
    @Test
    public void testThatWhenAPlayerPlayInPosition7IsNotEmpty(){
        Player[] players = ticToe.getPlayers();
        ticToe.markBoard(players[0], 7);
        assertFalse(ticToe.isEmpty());
        assertEquals(players[0].getTicTacSigns(), ticToe.getBoard()[2][0]);
    }
    @Test
    public void testThatWhenAPositionIsPlayedByAPlayerThatPositionCannotBePlayedAgain(){
        Player[] players = ticToe.getPlayers();
        ticToe.markBoard(players[0], 7);
        assertThrows(PositionAlreadyPlayed.class,() -> ticToe.markBoard(players[1], 7));
        assertEquals(players[0].getTicTacSigns(), ticToe.getBoard()[2][0]);
    }
    @Test
    public  void testThatWhenPlayer0PlaysVerticalInARowWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[0], 1);
        ticToe.play(players[0], 2);
        ticToe.play(players[0], 3);
        assertEquals(players[0].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public  void testThatWhenAPlayer1PlaysVerticalInARowWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[1], 4);
        ticToe.play(players[1], 5);
        ticToe.play(players[1], 6);
        assertEquals(players[1].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public  void testThatWhenAPlayer0PlaysHorizontallyInAColumnWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[0], 1);
        ticToe.play(players[0], 4);
        ticToe.play(players[0], 7);
        assertEquals(players[0].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public void testThatWhenAPlayer1PlaysHorizontallyInAColumnWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[1], 2);
        ticToe.play(players[1], 5);
        ticToe.play(players[1], 8);
        assertEquals(players[1].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public void testThatWhenAPlayer0playsDiagonallyWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[0], 1);
        ticToe.play(players[0], 5);
        ticToe.play(players[0], 9);
        assertEquals(players[0].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public void testThatWhenAPlayer1playsDiagonallyWithoutObstructionIsAWin(){
        Player[] players = ticToe.getPlayers();
        ticToe.play(players[1], 3);
        ticToe.play(players[1], 5);
        ticToe.play(players[1], 7);
        assertEquals(players[1].getTicTacSigns(), ticToe.winner().getTicTacSigns());
    }
    @Test
    public void testThatGameIsDraw(){
        Player[] players = ticToe.getPlayers();
        ticToe.markBoard(players[0], 1);
        ticToe.markBoard(players[1], 2);
        ticToe.markBoard(players[0], 3);
        ticToe.markBoard(players[1], 4);
        ticToe.markBoard(players[0], 5);
        ticToe.markBoard(players[1], 6);
        ticToe.markBoard(players[0], 7);
        ticToe.markBoard(players[1], 8);
        ticToe.markBoard(players[0], 9);
        assertTrue(ticToe.draw());
    }
}