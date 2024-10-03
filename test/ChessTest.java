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
}
