package com.fyfe.abstractFactory.resourceFactory.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;
import com.fyfe.abstractFactory.product.impl.ClassPathPictureResource;
import com.fyfe.abstractFactory.product.impl.ClassPathTextResource;
import com.fyfe.abstractFactory.product.impl.ClassPathVideoResource;
import com.fyfe.abstractFactory.resourceFactory.AbstractResourceLoader;
import com.fyfe.abstractFactory.resourceFactory.IResourceLoader;

public class ClassPathResourceLoader extends AbstractResourceLoader{


    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new ClassPathPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new ClassPathVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTextResource(String url) {
        return new ClassPathTextResource(url);
    }
}
