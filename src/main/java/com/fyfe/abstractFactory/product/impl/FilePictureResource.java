package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

public class FilePictureResource extends AbstractPictureResource {

    public FilePictureResource() {
        super();
    }

    public FilePictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
