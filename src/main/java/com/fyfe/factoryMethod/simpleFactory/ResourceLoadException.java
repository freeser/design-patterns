package com.fyfe.factoryMethod.simpleFactory;

public class ResourceLoadException extends RuntimeException {
    public ResourceLoadException() {
        super("加载资源时发生异常");
    }
    public ResourceLoadException(String message) {
        super(message);
    }
}
