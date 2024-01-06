package tic_tac_toe;

public class Player {
    private TicToeSigns ticTacSigns;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Player(TicToeSigns ticTacSigns) {
        this.ticTacSigns = ticTacSigns;
    }

    public TicToeSigns getTicTacSigns() {
        return ticTacSigns;
    }


    public String getName() {
        return name;
    }
}
