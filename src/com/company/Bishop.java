package com.company;

/**
 * Created by krishmunot on 11/22/15.
 */
public class Bishop extends Piece {

    public Bishop() {
        horizontal = false;
        vertical = false;
        diagonal = true;
        diagonalCaptureOnly = false;
    }

    public ChessGame.pieceType typeGetBishop(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WBISHOP;
        }
        return ChessGame.pieceType.BBISHOP;

    }
}
