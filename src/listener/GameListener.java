package listener;

import model.ChessboardPoint;
import view.CellComponent;
import view.animals.AnimalChessComponent;


public interface GameListener {

    void onPlayerClickCell(ChessboardPoint point, CellComponent component);
    void onPlayerClickChessPiece(ChessboardPoint point, AnimalChessComponent component);


}