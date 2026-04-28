package com.fyfe.factoryMethod.resourceFactory;

import com.fyfe.factoryMethod.simpleFactory.Resource;

public interface IResourceLoader {
    Resource loader(String url);
}
