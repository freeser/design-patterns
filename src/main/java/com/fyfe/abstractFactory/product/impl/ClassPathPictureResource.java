package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class ClassPathPictureResource extends AbstractPictureResource {

    public ClassPathPictureResource() {
        super();
    }

    public ClassPathPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
