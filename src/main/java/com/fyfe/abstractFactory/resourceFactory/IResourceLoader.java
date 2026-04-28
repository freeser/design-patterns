package com.fyfe.abstractFactory.resourceFactory;

import com.fyfe.abstractFactory.product.AbstractPictureResource;
import com.fyfe.abstractFactory.product.AbstractTextResource;
import com.fyfe.abstractFactory.product.AbstractVideoResource;

public interface IResourceLoader {
    /**
     * 加载图片资源的工厂方法
     * @param url 给定的资源URL
     * @return 图片资源
     */
    AbstractPictureResource loadPictureResource(String url);

    /**
     * 加载文本视频资源的工厂方法
     * @param url 给定的资源URL
     * @return 视频资源
     */
    AbstractVideoResource loadVideoResource(String url);

    /**
     * 加载文本资源的工厂方法
     * @param url 给定的资源URL
     * @return 文本资源
     */
    AbstractTextResource loadTextResource(String url);
}
