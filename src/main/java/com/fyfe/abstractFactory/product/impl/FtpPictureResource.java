package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class FtpPictureResource extends AbstractPictureResource {

    public FtpPictureResource() {
        super();
    }

    public FtpPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
