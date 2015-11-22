package com.company;

public class Piece {


    /**
     * Update: Not Sure if Actually Going to Ever Use This Class
     */

    protected int color;
    /**
     * Specify Piece Type (Prefix Black "B" vs. White "W" Pieces)
     */
    public Piece(){
    }
    /**
     * Board Coordinates of Piece
     */
    protected int row, column;

    /**
     * Specify Valid Movements of the Piece (If Ends in "CaptureOnly", Only Valid Movement for Capturing Enemy Piece i.e. Pawn Diagonal Capture)
     */
    boolean horizontal, vertical, diagonal, diagonalCaptureOnly;



}
