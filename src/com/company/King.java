package com.company;

public class King extends Piece {

    public King(int initRow, int initColumn, int color) {

        horizontal = true;
        vertical = true;
        diagonal = true;
        diagonalCaptureOnly = false;

        this.row = initRow;
        this.column = initColumn;
        this.color = color;

    }

    public ChessGame.pieceType typeGetKing(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WKING;
        }
        return ChessGame.pieceType.BKING;

    }



   /* public pieceType typeGet(){
       return pieceType.KING;
    }*/

}
