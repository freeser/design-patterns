package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class DefaultTextResource extends AbstractTextResource {

    public DefaultTextResource() {
        super();
    }

    public DefaultTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
