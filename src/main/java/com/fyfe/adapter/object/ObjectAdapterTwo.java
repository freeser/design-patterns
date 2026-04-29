package com.fyfe.adapter.object;

public class ObjectAdapterTwo implements Target{

    private AdapteeTwo adaptee;

    public ObjectAdapterTwo(AdapteeTwo adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
