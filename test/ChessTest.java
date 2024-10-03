import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ChessTest {
    @Test
    public void testGetTileEmptyBoard() {
        ChessBoard board = new ChessBoard();
        assertNull(board.getTile(1, 1));
    }

    @Test
    public void testGetTile
}
