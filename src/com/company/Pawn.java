package com.company;

public class Pawn extends Piece{

    /**
     * Pawn Constructor: Initialize All Attributes from Piece Class
     */
    public Pawn(int initRow, int initColumn, int color){

        horizontal = false;
        vertical = true;
        diagonal = false;
        diagonalCaptureOnly = true;

        this.row = initRow;
        this.column = initColumn;
        color = this.color;

    }

    public ChessGame.pieceType typeGetPawn(int column, int row, int color){
        if(color == 0) {
            return ChessGame.pieceType.WPAWN;
        }
        return ChessGame.pieceType.BPAWN;

    }
}
