package tic_tac_toe;

public class TicToe {
    private boolean cellValuePlayer = false;
    private int ROWS = 3;
    private int COLUMNS = 3;
    private Player winner;
    private TicToeSigns[][] board = new TicToeSigns[3][3];
    private boolean draw = false;

    Player[] player = new Player[2];


    public boolean isGameContinue() {
        return gameContinue;
    }

    private boolean gameContinue = true;

    public TicToe() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = TicToeSigns.Empty;
            }
        }
        player[0] = new Player(TicToeSigns.X);
        player[1] = new Player(TicToeSigns.O);
    }

    public TicToeSigns[][] getBoard() {
        return board;
    }

    public void twoPlayers(String player, String players) {
        for (int i = 0; i <= 9; i++) {
            String cellValue = null;
            if (cellValue == player) {
                player = "X";
            } else if (cellValue == players) {
                player = "O";
            }
        }
    }
    public boolean draw(){
        return draw;
    }

    public Player[] getPlayers() {
        return player;
    }

    public boolean isEmpty() {
        for (int count = 0; count < board.length; count++) {
            if (!checkIfColumnAreEmpty(count)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkIfColumnAreEmpty(int count) {
        boolean result = true;
        for (int counter = 0; counter < board.length; counter++) {
            if (board[count][counter] != TicToeSigns.Empty) {
                result = false;
                break;
            }
        }
        return result;
    }

    public void markBoard(Player player, int position) {
        if (position == 1) {
            spaceIsNotEmpty(0, 0);
            board[0][0] = player.getTicTacSigns();
        } else if (position == 2) {
            spaceIsNotEmpty(0, 1);
            board[0][1] = player.getTicTacSigns();
        } else if (position == 3) {
            spaceIsNotEmpty(0, 2);
            board[0][2] = player.getTicTacSigns();
        } else if (position == 4) {
            spaceIsNotEmpty(1, 0);
            board[1][0] = player.getTicTacSigns();
        } else if (position == 5) {
            spaceIsNotEmpty(1, 1);
            board[1][1] = player.getTicTacSigns();
        } else if (position == 6) {
            spaceIsNotEmpty(1, 2);
            board[1][2] = player.getTicTacSigns();
        } else if (position == 7) {
            spaceIsNotEmpty(2, 0);
            board[2][0] = player.getTicTacSigns();
        } else if (position == 8) {
            spaceIsNotEmpty(2, 1);
            board[2][1] = player.getTicTacSigns();
        } else if (position == 9) {
            spaceIsNotEmpty(2, 2);
            board[2][2] = player.getTicTacSigns();
        }
    }

    private void spaceIsNotEmpty(int row, int column) {
        if (board[row][column] != TicToeSigns.Empty) throw new PositionAlreadyPlayed("Already filled");
    }
    public void play(Player player, int position) {
        markBoard(player, position);
        check(player);
        if(checkBoardEmpty()){
            draw = true;
            gameContinue = false;
        }
        if (winner() != null){
            gameContinue = false;
        }
    }

    private void check(Player player) {
        row1(player);
        row2(player);
        row3(player);
        colum3(player);
        colum2(player);
        colum1(player);
        horizon2(player);
        horizon1(player);
    }

    private boolean checkBoardEmpty() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != TicToeSigns.Empty) return false;
            }
        }
        return true;
    }

    public Player winner() {
        return winner;
    }
    private void row3(Player player) {
        if (player.getTicTacSigns() == board[2][0] && player.getTicTacSigns() == board[2][1] && player.getTicTacSigns() == board[2][2]) {
            winner = player;
        }
    }

    private void row2(Player player) {
        if (player.getTicTacSigns() == board[1][0] && player.getTicTacSigns() == board[1][1] && player.getTicTacSigns() == board[1][2]) {
            winner = player;
        }
    }

    private void row1(Player player) {
        if (player.getTicTacSigns() == board[0][0] && player.getTicTacSigns() == board[0][1] && player.getTicTacSigns() == board[0][2]) {
            winner = player;
        }
      
    }

    private void column3(Player player) {
        colum3(player);
    }

    private void colum3(Player player) {
        if(player.getTicTacSigns() == board[0][2] && player.getTicTacSigns() == board [1][2] && player.getTicTacSigns() == board [2][2]){
            winner = player;
        }
    }


    private void colum2(Player player) {
        if(player.getTicTacSigns() == board[0][1] && player.getTicTacSigns() == board [1][1] && player.getTicTacSigns() == board [2][1]){
            winner = player;
        }
    }

    private void colum1(Player player) {
        if(player.getTicTacSigns() == board[0][0] && player.getTicTacSigns() == board [1][0] && player.getTicTacSigns() == board [2][0]){
            winner = player;
        }
    }


    private void horizon1(Player player) {
        if (player.getTicTacSigns() == board[0][0] && player.getTicTacSigns() == board[1][1] && player.getTicTacSigns() == board[2][2]) {
            winner = player;
        }
    }



    private void horizon2(Player player) {
        if (player.getTicTacSigns() == board[0][2] && player.getTicTacSigns() == board[1][1] && player.getTicTacSigns() == board[2][0]) {
            winner = player;
        }
    }


}
  