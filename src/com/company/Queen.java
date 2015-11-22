package com.company;

public class Queen extends Piece {

    public Queen() {
        horizontal = true;
        vertical = true;
        diagonal = true;
        diagonalCaptureOnly = false;
    }

    public ChessGame.pieceType typeGetQueen(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WQUEEN;
        }
        return ChessGame.pieceType.BQUEEN;

    }
}
