package model;

import java.io.Serializable;

public class Cell implements Serializable {
    // the position for chess
    private ChessPiece piece;


    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }

    public void removePiece() {
        this.piece = null;
    }
}
