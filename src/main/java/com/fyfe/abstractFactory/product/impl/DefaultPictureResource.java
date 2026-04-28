package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class DefaultPictureResource extends AbstractPictureResource {

    public DefaultPictureResource() {
        super();
    }

    public DefaultPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
