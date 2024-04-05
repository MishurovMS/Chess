package Pieces;

import Board.ChessBoard;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if ((column + toColumn) < 1 && (column + toColumn) >= 8 || (line + toLine) < 1 && (line + toLine) >= 8) {

            if (color.equals("White")) {
                if (line == 1 && (line + toLine) == 3) {
                    return true;
                } else if (line != 1 && (line + toLine) == 2)
                    return true;

            }
            if (color.equals("Black")) {
                if (line == 6 && (line + toLine) == 5) {
                    return true;
                } else if (line != 6 && (line + toLine) == 4) return true;

            }


        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "P";
    }

}


