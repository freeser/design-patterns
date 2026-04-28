package com.fyfe.factoryMethod2.product;

import java.io.InputStream;

public abstract class AbstractResource {
    private String url;

    public AbstractResource() {
    }

    public AbstractResource(String url) {
        this.url = url;
    }

    protected void shared() {
        System.out.println("这是共享方法");
    }
    public abstract InputStream getInputStream();
}
