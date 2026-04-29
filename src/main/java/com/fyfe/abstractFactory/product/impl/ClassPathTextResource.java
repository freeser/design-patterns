package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class ClassPathTextResource extends AbstractTextResource {

    public ClassPathTextResource() {
        super();
    }

    public ClassPathTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
