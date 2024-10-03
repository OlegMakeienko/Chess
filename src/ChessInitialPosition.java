public enum ChessInitialPosition {
    WHITE_ROOK_1("Rook", "White", 1, 1),
    WHITE_KNIGHT_1("Knight", "White", 2, 1),
    WHITE_BISHOP_1("Bishop", "White", 3, 1),
    WHITE_QUEEN("Queen", "White", 4, 1),
    WHITE_KING("King", "White", 5, 1),
    WHITE_BISHOP_2("Bishop", "White", 6, 1),
    WHITE_KNIGHT_2("Knight", "White", 7, 1),
    WHITE_ROOK_2("Rook", "White", 8, 1),

    BLACK_ROOK_1("Rook", "Black", 1, 8),
    BLACK_KNIGHT_1("Knight", "Black", 2, 8),
    BLACK_BISHOP_1("Bishop", "Black", 3, 8),
    BLACK_QUEEN("Queen", "Black", 4, 8),
    BLACK_KING("King", "Black", 5, 8),
    BLACK_BISHOP_2("Bishop", "Black", 6, 8),
    BLACK_KNIGHT_2("Knight", "Black", 7, 8),
    BLACK_ROOK_2("Rook", "Black", 8, 8),

    // Vit bondelinje
    WHITE_PAWN_1("Pawn", "White", 1, 2),
    WHITE_PAWN_2("Pawn", "White", 2, 2),
    WHITE_PAWN_3("Pawn", "White", 3, 2),
    WHITE_PAWN_4("Pawn", "White", 4, 2),
    WHITE_PAWN_5("Pawn", "White", 5, 2),
    WHITE_PAWN_6("Pawn", "White", 6, 2),
    WHITE_PAWN_7("Pawn", "White", 7, 2),
    WHITE_PAWN_8("Pawn", "White", 8, 2),

    // Svart bondelinje
    BLACK_PAWN_1("Pawn", "Black", 1, 7),
    BLACK_PAWN_2("Pawn", "Black", 2, 7),
    BLACK_PAWN_3("Pawn", "Black", 3, 7),
    BLACK_PAWN_4("Pawn", "Black", 4, 7),
    BLACK_PAWN_5("Pawn", "Black", 5, 7),
    BLACK_PAWN_6("Pawn", "Black", 6, 7),
    BLACK_PAWN_7("Pawn", "Black", 7, 7),
    BLACK_PAWN_8("Pawn", "Black", 8, 7);

    private final String name;
    private final String color;
    private final int x;
    private final int y;

    ChessInitialPosition(String name, String color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece toPiece() {
//        switch(this) {
//            case WHITE_KING:
//                return new King("white");
//            case BLACK_QUEEN:
//                return new Queen("black");
//            case WHITE_PAWN:
//                return new Pawn("white");
//            // Och så vidare för varje pjäs...
//        }
        return null;
    }
}
