package com.fyfe.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 替换构造器
public class ChessPiece {
    private ChessUnit chessUnit;
    private Position position;
}
