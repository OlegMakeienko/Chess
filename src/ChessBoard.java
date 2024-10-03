public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
    }

    public Piece getTile(int row, int col) {
        if(row < 1 || row > 8 || col < 1 || col > 8) {
            return null;
        }
        return board[row - 1][ col - 1];
    }
}
