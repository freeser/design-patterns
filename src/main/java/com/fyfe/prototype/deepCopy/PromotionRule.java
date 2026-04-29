package com.fyfe.prototype.deepCopy;

import lombok.Data;

import java.io.Serializable;

@Data
public class PromotionRule  implements Cloneable, Serializable {
    private String type;
    private double discount;
    private Product product;

    @Override
    public PromotionRule clone() throws CloneNotSupportedException {
        PromotionRule cloned =  (PromotionRule) super.clone();
        if (product != null) {
            Product copyProduct =  product.clone();
            cloned.setProduct(copyProduct);
        }
        return cloned;
    }
}
