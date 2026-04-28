package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class FtpVideoResource extends AbstractVideoResource {

    public FtpVideoResource() {
        super();
    }

    public FtpVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
