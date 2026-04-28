package com.fyfe.factoryMethod.simpleFactory;

public class ResourceLoader {
    public Resource load(String url) {
        String prefix = getPrefix(url);
        return ResourceFactory.create(prefix, url);
    }

    private  String getPrefix(String url) {
        if (url == null || "".equals(url) || !url.contains(":")) {
            throw new ResourceLoadException();
        }
        return url.split(":")[0];
    }
}
