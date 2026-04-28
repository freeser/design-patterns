package com.fyfe.factoryMethod.simpleFactory;

public class ResourceFactory
{
    public static Resource create(String prefix, String url) {
        if ("http".equals(prefix)) {
            // .. ToDO
            return  new Resource(url);
        } else if ("file".equals(prefix)) {
            // .. ToDO
            return  new Resource(url);
        }
        return  new Resource("default");
    }
}
