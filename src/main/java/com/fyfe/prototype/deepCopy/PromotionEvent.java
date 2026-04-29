package com.fyfe.prototype.deepCopy;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PromotionEvent  implements Cloneable, Serializable {
    private String name;
    private Date startDate;
    private Date endDate;
    private List<PromotionRule> rules;
    // 省略构造函数、getter和setter方法

    // 在促销活动中的clone方法需要克隆里边所有的非基础数据类型
    @Override
    public PromotionEvent clone() {
        try {
            PromotionEvent clonedEvent = (PromotionEvent) super.clone();
            if (startDate != null) {
                clonedEvent.startDate = (Date) startDate.clone();
            }
            if (endDate != null) {
                clonedEvent.endDate = (Date) endDate.clone();
            }
            if (rules != null && rules.size() > 0) {
                List<PromotionRule> copyRules = new ArrayList<>();
                for (PromotionRule rule : rules) {
                    copyRules.add(rule.clone());
                }
                clonedEvent.setRules(copyRules);
            }
            return clonedEvent;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}