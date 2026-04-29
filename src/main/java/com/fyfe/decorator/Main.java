package com.fyfe.decorator;

public class Main {
    public static void main(String[] args) {
        // 创建一个原始对象
        Component component = new ConcreteComponent();
        // 进行第一次包装
        component = new DecoratorOne(component);
        // 进行第二次
        component = new DecoratorTwo(component);
        component.operation();
    }
}
