package Pieces;

import Board.ChessBoard;


public class Horse extends ChessPiece {


    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int[][] position = new int[8][8];

        if (line< 0 || column < 0 || line >= 8 || column >= 8) return false;
        if((line+toLine)<0||(column+toColumn)<0||(line+toLine)>=8||(column+toColumn)>=8)return false;
        int X[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int Y[] = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i <position.length; i++) {

            toLine =line+X[i];
            toColumn =column+Y[i];
            if (toLine > 0 && toColumn > 0 && toLine < 8 && toColumn < 8) return true;
        }
        return false;


    }


    @Override
    public String getSymbol() {
        return "H";
    }
}
