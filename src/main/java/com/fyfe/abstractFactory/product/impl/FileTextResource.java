package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

public class FileTextResource extends AbstractTextResource {

    public FileTextResource() {
        super();
    }

    public FileTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
