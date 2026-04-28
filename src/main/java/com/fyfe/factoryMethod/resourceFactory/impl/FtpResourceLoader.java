package com.fyfe.factoryMethod.resourceFactory.impl;

import com.fyfe.factoryMethod.resourceFactory.IResourceLoader;
import com.fyfe.factoryMethod.simpleFactory.Resource;

public class FtpResourceLoader implements IResourceLoader {

    @Override
    public Resource loader(String url) {
        // TODO，省略复杂的过程
        return new Resource(url);
    }
}
