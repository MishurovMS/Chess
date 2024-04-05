package Pieces;

import Board.ChessBoard;

public class King extends ChessPiece {

    private int[][] board;
    private final int[][] matrix = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 0, 0}
    };

    public void move(int line, int column) {
        matrix[line - 1][column - 1] = 1;
    }

    public boolean isUnderAttack(ChessBoard board,int line, int column) {
        if (line >= 0 && line < matrix.length && column >= 0 && column < matrix[0].length) {

            if (matrix[line][column] == 1) {
                return true;
            } else {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i != 0 || j != 0) {
                            if (isInside(line + i, column + j)) {
                                if (matrix[line + i][column + j] == 0) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }

    private boolean isInside(int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }


    public King(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка, что фигура не пытается двигаться за пределы доски
        if (line < 0 || column < 0 || toLine < 0 || toColumn < 0)
            return false;


        if (line == toLine && column == toColumn)
            return false;

        if ((board[line][column] == 1 && board[toLine][toColumn] == 2) || (board[line][column] == 2 && board[toLine][toColumn] == 1))
            return true;
        else if ((board[line][column] == 2) && (board[toLine][toColumn] == 1))
            return true;
        else if ((board[line][column] == 1) && (board[toLine][toColumn] == 2))
            return true;


        return false;
    }


    @Override
    public String getSymbol() {
        return "K";
    }
}
