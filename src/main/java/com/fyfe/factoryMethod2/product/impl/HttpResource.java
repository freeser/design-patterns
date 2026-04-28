package com.fyfe.factoryMethod2.product.impl;

import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

public class HttpResource extends AbstractResource {

    public HttpResource() {
        super();
    }

    public HttpResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
