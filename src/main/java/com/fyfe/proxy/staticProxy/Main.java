package com.fyfe.proxy.staticProxy;

public class Main {
    public static void main(String[] args) {
        DatabaseDateQueryProxy dataQuery = new DatabaseDateQueryProxy();
        String value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key1");
        System.out.println(value);

        value = dataQuery.query("key2");
        System.out.println(value);
    }
}
