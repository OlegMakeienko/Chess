package com.makeienko;

import java.util.Objects;

public abstract class Piece {
    private String name;
    private String color;

    public Piece(String name, String color) {
        this.name = name;
        this.color = color;
    }

    protected boolean isMoving(int fromX, int fromY, int toX, int toY) { //метод повертає true, якщо фігура рухається
        return fromX != toX && fromY != toY;
    }

    protected boolean isPathClear(int fromX, int fromY, int toX, int toY, ChessBoard board) {
        int dx = Integer.compare(toX, fromX);
        int dy = Integer.compare(toY, fromY);

        int x = fromX + dx;
        int y = fromY + dy;

        while (x != toX || y != toY) {
            if (!board.isTileEmpty(x, y)) {
                return false;
            }
            x += dx;
            y += dy;
        }
        return true;
    }

    public boolean canMove(int fromX, int fromY, int toX, int toY, ChessBoard board) {
        if (isMoving(fromX, fromY, toX, toY)) {
            return false;
        }

        if (!isPathClear(fromX, fromY, toX, toY, board)) {
            return false;
        }

        return specificCanMove(fromX, fromY, toX, toY, board);
    }

    public abstract boolean specificCanMove(int fromX, int fromY, int toX, int toY, ChessBoard board);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return name.equals(piece.name) && color.equals(piece.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
