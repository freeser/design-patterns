package com.fyfe.adapter.object;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);

        AdapteeTwo adapteeTwo = new AdapteeTwo();
        ObjectAdapterTwo objectAdapterTwo = new ObjectAdapterTwo(adapteeTwo);

        List<Target> targets = List.of(objectAdapter, objectAdapterTwo);

        for (Target target : targets) {
            target.request();
        }
    }
}
