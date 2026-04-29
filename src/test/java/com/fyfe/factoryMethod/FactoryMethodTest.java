package com.fyfe.factoryMethod;

import com.fyfe.factoryMethod2.product.AbstractResource;
import com.fyfe.factoryMethod2.resourceFactory.ResourceLoader;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
public class FactoryMethodTest {
    @Test
    public void testFactoryMethod() {
        String url = "file://D://a.txt";
        ResourceLoader resourceLoader = new ResourceLoader();
        AbstractResource load = resourceLoader.load(url);
        log.info("resource --> {}", load.getClass().getName());
    }
}

