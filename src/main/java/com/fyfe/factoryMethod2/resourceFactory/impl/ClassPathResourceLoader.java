package com.fyfe.factoryMethod2.resourceFactory.impl;

import com.fyfe.factoryMethod.simpleFactory.Resource;
import com.fyfe.factoryMethod2.product.AbstractResource;
import com.fyfe.factoryMethod2.product.impl.ClassPathResource;
import com.fyfe.factoryMethod2.resourceFactory.IResourceLoader;

public class ClassPathResourceLoader implements IResourceLoader {

    @Override
    public AbstractResource loader(String url) {
        // TODO，省略复杂的过程
        return new ClassPathResource(url);
    }
}
