package com.fyfe.abstractFactory.resourceFactory.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;
import com.fyfe.abstractFactory.product.impl.DefaultPictureResource;
import com.fyfe.abstractFactory.product.impl.DefaultTextResource;
import com.fyfe.abstractFactory.product.impl.DefaultVideoResource;
import com.fyfe.abstractFactory.resourceFactory.AbstractResourceLoader;

public class DefaultResourceLoader  extends AbstractResourceLoader {


    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new DefaultPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new DefaultVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTextResource(String url) {
        return new DefaultTextResource(url);
    }
}
