package com.fyfe.decoretor;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DecoratorTest {
    @Test
    public void testIO() throws IOException {
        // 1、创建
        FileInputStream in = new FileInputStream(("D:\\Study\\javacode\\design-patterns\\pom.xml"));

        // 3、读取
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > -1) {
            System.out.println(new String(buf, 0, len));
        }

        // 3、关闭
        in.close();
    }
}
