package com.fyfe.proxy.dynamicProxy.aop;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Map<String, String> map = new HashMap<>(256);
    public static String get(String key) {
        return map.get(key);
    }
    public static void put(String key, String value) {
        map.put(key, value);
    }
}
