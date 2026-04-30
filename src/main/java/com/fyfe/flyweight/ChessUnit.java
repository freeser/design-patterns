package com.fyfe.flyweight;

import lombok.ToString;

@ToString
public class ChessUnit {
    private Long id;
    private String text;
    private Color Color;

    public ChessUnit(Long id, String text, Color color) {
        this.id = id;
        this.text = text;
        Color = color;
    }

    public enum Color {
        RED,BLACK
    }
}
