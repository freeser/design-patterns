package com.fyfe.adapter.classType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Target target = new ClassAdapter();
//        target.request();

        List<Target> targets = List.of(new ClassAdapter(), new ClassAdapterTwo());

        for (Target target : targets) {
            target.request();
        }
    }
}
