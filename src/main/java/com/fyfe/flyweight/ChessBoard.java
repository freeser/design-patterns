package com.fyfe.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    // 应该持有一套棋子，有具体的坐标
    private Map<Position, ChessPiece> chessPieceMap;

    public ChessBoard() {
        this.chessPieceMap = new HashMap<Position, ChessPiece>(64);

        Position position1 = new Position(1, 2);
        chessPieceMap.put(position1, new ChessPiece(ChessUnitFactory.getChessUnit(1L), position1));

        Position position2 = new Position(1, 3);
        chessPieceMap.put(position2, new ChessPiece(ChessUnitFactory.getChessUnit(2L), position2));

        Position position3 = new Position(2, 3);
        chessPieceMap.put(position3, new ChessPiece(ChessUnitFactory.getChessUnit(3L), position3));


    }

    public void display() {
        for (Map.Entry<Position, ChessPiece> entry : chessPieceMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.display();
    }
}
