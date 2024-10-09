package com.makeienko;

public class King extends Piece {
    public King(String name, String color) {
        super("King", color);
    }

    @Override
    public boolean specificCanMove(int fromX, int fromY, int toX, int toY, ChessBoard board) {
        int dx = Math.abs(toX - fromX);
        int dy = Math.abs(toY - fromY);
        return (dx <= 1 && dy <= 1);
    }
}
