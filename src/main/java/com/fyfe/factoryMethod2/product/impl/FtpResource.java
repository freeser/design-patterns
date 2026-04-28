package com.fyfe.factoryMethod2.product.impl;

import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

public class FtpResource extends AbstractResource {

    public FtpResource() {
        super();
    }

    public FtpResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
