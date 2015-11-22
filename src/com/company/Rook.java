package com.company;

public class Rook extends Piece{

    public Rook() {
        horizontal = true;
        vertical = true;
        diagonal = false;
        diagonalCaptureOnly = false;
    }

    public ChessGame.pieceType typeGetRook(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WROOK;
        }
        return ChessGame.pieceType.BROOK;

    }
}
