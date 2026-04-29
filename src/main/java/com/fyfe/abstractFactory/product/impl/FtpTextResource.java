package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class FtpTextResource extends AbstractTextResource {

    public FtpTextResource() {
        super();
    }

    public FtpTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
