import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ChessTest {
    @Test
    public void testGetTileEmptyBoard() {
        ChessBoard board = new ChessBoard();
        assertNull(board.getTile(1, 1));
    }

    @Test
    public void testWhiteKingPosition() {
        ChessBoard board = new ChessBoard();
        Piece piece = ChessInitialPosition.WHITE_KING.toPiece();
        ChessInitialPosition position = ChessInitialPosition.WHITE_KING;
        board.setTile(position.getX(), position.getY(), piece);

        assertEquals(ChessInitialPosition.WHITE_KING.toPiece(), board.getTile(5, 1));
    }

    @Test
    void testResetBoard() {
        ChessBoard board = new ChessBoard();
        board.resetBoard();

        for (ChessInitialPosition position : ChessInitialPosition.values()) {
            assertEquals(position.toPiece(), board.getTile(position.getX(), position.getY()));
        }
    }
}
