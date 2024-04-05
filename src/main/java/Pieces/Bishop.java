package Pieces;

import Board.ChessBoard;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8)
            return false;

        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8)
            return false;
        if (line == toLine && column == toColumn)
            return false;
        if ((line == 0 && column == 7) || (line == 7 && column == 0))
            return true;
        else if ((line == 0 && column == 1) || (line == 1 && column == 0))
            return true;

return false;
    }


    @Override
    public String getSymbol() {
        return "B";
    }
}
