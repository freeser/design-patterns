package com.fyfe.abstractFactory.product;

import java.io.InputStream;

public class AbstractTextResource implements Resource {
    private String url;
    public AbstractTextResource() {
    }
    public AbstractTextResource(String url) {
        this.url = url;
    }
    // 图片的公用成员方法等
    @Override
    public InputStream getInputStream() {
        return null;
    }
}
