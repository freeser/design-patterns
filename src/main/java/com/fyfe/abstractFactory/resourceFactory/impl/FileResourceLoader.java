package com.fyfe.abstractFactory.resourceFactory.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;
import com.fyfe.abstractFactory.product.impl.FilePictureResource;
import com.fyfe.abstractFactory.product.impl.FileTextResource;
import com.fyfe.abstractFactory.product.impl.FileVideoResource;
import com.fyfe.abstractFactory.resourceFactory.AbstractResourceLoader;

public class FileResourceLoader  extends AbstractResourceLoader {


    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new FilePictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new FileVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTextResource(String url) {
        return new FileTextResource(url);
    }
}
