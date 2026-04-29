package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class HttpTextResource extends AbstractTextResource {

    public HttpTextResource() {
        super();
    }

    public HttpTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
