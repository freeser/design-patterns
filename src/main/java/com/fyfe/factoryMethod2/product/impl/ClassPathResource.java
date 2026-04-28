package com.fyfe.factoryMethod2.product.impl;

import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

public class ClassPathResource extends AbstractResource {

    public ClassPathResource() {
        super();
    }

    public ClassPathResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
