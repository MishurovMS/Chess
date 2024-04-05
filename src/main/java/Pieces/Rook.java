package Pieces;

import Board.ChessBoard;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((0 <= line) && (line < 8) && (0 <= column) && (column < 8))
            return true;
        if (((toLine - line == toColumn - column) || (toLine - column == line - toColumn)) && (toLine != line) && (toColumn != column))
            return true;


        return false;
    }


    @Override
    public String getSymbol() {
        return "R";
    }
}
