package com.fyfe.adapter.classType;

/**
 * 使用继承来实现适配的能力
 */
public class ClassAdapterTwo extends AdapteeTwo implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}