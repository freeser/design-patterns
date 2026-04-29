package com.fyfe.prototype.deepCopy;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PromotionEvent promotionEvent = new PromotionEvent();
        promotionEvent.setStartDate(new Date());


        PromotionRule promotionRule = new PromotionRule();

        promotionRule.setType("折扣");
        promotionRule.setDiscount(0.9);

        Product product = new Product();
        promotionRule.setProduct(product);
        // ??
        promotionEvent.setRules(List.of(promotionRule));

        // 深拷贝
        PromotionEvent clonedEvent = promotionEvent.clone();
        System.out.println(clonedEvent.getRules().get(0).getProduct() == product); // false
    }
}
