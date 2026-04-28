package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class HttpPictureResource extends AbstractPictureResource {

    public HttpPictureResource() {
        super();
    }

    public HttpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
