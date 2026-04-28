package com.fyfe.abstractFactory.resourceFactory.impl;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;
import com.fyfe.abstractFactory.product.impl.FtpPictureResource;
import com.fyfe.abstractFactory.product.impl.FtpTextResource;
import com.fyfe.abstractFactory.product.impl.FtpVideoResource;
import com.fyfe.abstractFactory.resourceFactory.AbstractResourceLoader;
import com.fyfe.abstractFactory.resourceFactory.IResourceLoader;

public class FtpResourceLoader  extends AbstractResourceLoader {


    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new FtpPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new FtpVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTextResource(String url) {
        return new FtpTextResource(url);
    }
}
