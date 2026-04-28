package com.fyfe.factoryMethod2.product.impl;

import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

public class FileResource extends AbstractResource {

    public FileResource() {
        super();
    }

    public FileResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
