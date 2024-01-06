package tic_tac_toe;

public class PositionAlreadyPlayed extends RuntimeException {
    public PositionAlreadyPlayed(String message){
        super(message);
    }
}
