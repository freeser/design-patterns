package com.fyfe.factoryMethod2.resourceFactory;

import com.fyfe.factoryMethod.simpleFactory.Resource;
import com.fyfe.factoryMethod2.product.AbstractResource;

public interface IResourceLoader {
    AbstractResource loader(String url);
}
