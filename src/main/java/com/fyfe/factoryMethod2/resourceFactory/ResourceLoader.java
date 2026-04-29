package com.fyfe.factoryMethod2.resourceFactory;

import com.fyfe.factoryMethod.simpleFactory.ResourceLoadException;
import com.fyfe.factoryMethod2.product.AbstractResource;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ResourceLoader {

        private static Map<String, IResourceLoader> resourceLoaderCache = new HashMap<>(8);
    //    版本二
    //    static {
    //        resourceLoaderCache.put("http", new HttpResourceLoader());
    //        resourceLoaderCache.put("file", new FileResourceLoader());
    //        resourceLoaderCache.put("classpath", new ClassPathResourceLoader());
    //        resourceLoaderCache.put("default", new DefaultResourceLoader());
    //    }
    //

    // 版本二结束
    // 版本三，增加配置文件
    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resourceLoader2.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            for (Map.Entry<Object, Object> entry: properties.entrySet()) {
                String key = entry.getKey().toString();
                Class<?> clazz = Class.forName(entry.getValue().toString());
                IResourceLoader loader = (IResourceLoader) clazz.getConstructor().newInstance();
                resourceLoaderCache.put(key, loader);
            }
        } catch (IOException | ClassNotFoundException | InvocationTargetException | InstantiationException |
                 IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    // 版本三结束
    public AbstractResource load(String url) {
        String prefix = getPrefix(url);
        return resourceLoaderCache.get(prefix).loader(url);
    }
    private  String getPrefix(String url) {
        if (url == null || "".equals(url) || !url.contains(":")) {
            throw new ResourceLoadException();
        }
        return url.split(":")[0];
    }
}
