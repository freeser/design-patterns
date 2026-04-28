package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class FileVideoResource extends AbstractVideoResource {

    public FileVideoResource() {
        super();
    }

    public FileVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
