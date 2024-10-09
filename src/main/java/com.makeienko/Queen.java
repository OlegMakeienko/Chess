package com.makeienko;

import com.makeienko.ChessBoard;
import com.makeienko.Piece;

public class Queen extends Piece {

    public Queen(String name, String color) {
        super("Queen", color);
    }

    @Override
    public boolean canMove(int fromX, int fromY, int toX, int toY, ChessBoard board) {
        // Kolla om drottningen inte rör sig (ingen rörelse)
        if(!isMoving(fromX, fromY, toX, toY)) {
            return false;
        };

        int dx = Math.abs(toX - fromX); // Skillnad i x-led
        int dy = Math.abs(toY - fromY); // Skillnad i y-led

        // Drottningen kan röra sig horisontellt, vertikalt eller diagonalt
        if (dx == dy || fromX == toX || fromY == toY) {
            // Kolla om vägen är fri
            if (isPathClear(fromX, fromY, toX, toY, board)) {
                Piece targetPiece = board.getTile(toX, toY);
                // Om det inte finns en pjäs på målrutan, eller om den är av motsatt färg
                return targetPiece == null || !targetPiece.getColor().equals(this.getColor());
            }
        }
        return false;  // Ogiltig flytt
    }

    @Override
    public boolean specificCanMove(int fromX, int fromY, int toX, int toY, ChessBoard board) {
        return false;
    }
}
