package com.fyfe.flyweight;

import org.junit.jupiter.api.Test;

public class FlyWeightTest {

    @Test
    public void TestInteger() {
        Integer i1 = 1;
        Integer i2 = 1;
        Integer i3 = new Integer(1);
        System.out.println(i1==i2);
        System.out.println(i1==i3);

        System.out.println("================================");

        i1 = 129;
        i2 = 129;
        i3 = new Integer(129);
        System.out.println(i1==i2);
        System.out.println(i1==i3);
    }

    public void testString() {
        String s1 = "itnamls";
        String s2 = "itnamls";
        String s3 = new String("itnamls");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
