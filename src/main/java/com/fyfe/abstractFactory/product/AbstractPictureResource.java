package com.fyfe.abstractFactory.product;

import java.io.InputStream;

public class AbstractPictureResource implements Resource {
    private String url;
    public AbstractPictureResource() {
    }
    public AbstractPictureResource(String url) {
        this.url = url;
    }
    // 图片的公用成员方法等
    @Override
    public InputStream getInputStream() {
        return null;
    }
}
