package com.project.chessengine;

public class ChessPiece {

    private ChessPieceColour colour;
    private ChessPieceType type;

    public ChessPiece(ChessPieceType type, ChessPieceColour colour){
        this.colour = colour;
        this.type = type;
    }

    public ChessPieceType getType(){
        return type;
    }

    public ChessPieceColour getColor(){
        return colour;
    }

    public String getSymbol() {
        switch (type) {
            case King:   return (colour == ChessPieceColour.White) ? "K" : "k";
            case Queen:  return (colour == ChessPieceColour.White) ? "Q" : "q";
            case Rook:   return (colour == ChessPieceColour.White) ? "R" : "r";
            case Bishop: return (colour == ChessPieceColour.White) ? "B" : "b";
            case Knight: return (colour == ChessPieceColour.White) ? "N" : "n";
            case Pawn:   return (colour == ChessPieceColour.White) ? "P" : "p";
            default: return " "; 
        }
    }
}