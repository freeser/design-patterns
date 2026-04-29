package com.fyfe.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("未包装的原始类");
    }
}
