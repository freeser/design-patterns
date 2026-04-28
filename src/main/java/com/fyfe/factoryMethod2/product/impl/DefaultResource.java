package com.fyfe.factoryMethod2.product.impl;

import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

public class DefaultResource extends AbstractResource {

    public DefaultResource() {
        super();
    }

    public DefaultResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
