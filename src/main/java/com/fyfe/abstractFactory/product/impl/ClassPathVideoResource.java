package com.fyfe.abstractFactory.product.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

public class ClassPathVideoResource extends AbstractVideoResource {

    public ClassPathVideoResource() {
        super();
    }

    public ClassPathVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
