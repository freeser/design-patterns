package com.fyfe.abstractFactory.resourceFactory.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;
import com.fyfe.abstractFactory.product.impl.HttpPictureResource;
import com.fyfe.abstractFactory.product.impl.HttpTextResource;
import com.fyfe.abstractFactory.product.impl.HttpVideoResource;
import com.fyfe.abstractFactory.resourceFactory.AbstractResourceLoader;
import com.fyfe.abstractFactory.resourceFactory.IResourceLoader;

public class HttpResourceLoader  extends AbstractResourceLoader {


    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new HttpPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new HttpVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTextResource(String url) {
        return new HttpTextResource(url);
    }
}
