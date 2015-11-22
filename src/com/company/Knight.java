package com.company;

public class Knight extends Piece {

    public Knight() {
        horizontal = true;
        vertical = true;
        diagonal = true;
        diagonalCaptureOnly = false;
    }


    public ChessGame.pieceType typeGetKnight(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WKNIGHT;
        }
        return ChessGame.pieceType.BKNIGHT;

    }
}
