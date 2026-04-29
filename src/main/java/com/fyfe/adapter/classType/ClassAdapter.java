package com.fyfe.adapter.classType;

/**
 * 使用继承来实现适配的能力
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}