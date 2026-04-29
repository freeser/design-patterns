package com.fyfe.prototype.deepCopy;

import java.io.Serializable;

public class Product implements Cloneable, Serializable {
    private String name;
    private double price;
    private int stock;

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
