package Pieces;

import Board.ChessBoard;

public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) return false;

        // Проверка выхода за пределы доски
        if (line < 0 || line >= 8 || column < 0 || column >= 8)
            return false;
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8)
            return false;

        int deltaLine = Math.abs(line - toLine);
        int deltaColumn = Math.abs(column - toColumn);

        if (deltaLine == deltaColumn) { // Ход по диагонали
            if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1)
                return true;
            else
                return false;
        } else if (deltaLine > deltaColumn) { // Ход по прямой
            for (int i = 0; i <= deltaLine - deltaColumn; i++) {
                if (line + i == toLine && column + i == toColumn)
                    return true;
                if (line + i == toLine && column - i == toColumn)
                    return true;
                if (line - i == toLine && column + i == toColumn)
                    return true;
                if (line - i == toLine && column - i == toColumn)
                    return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
