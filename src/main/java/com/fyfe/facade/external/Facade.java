package com.fyfe.facade.external;

public class Facade {
    private ExternalService1 externalService1 = new ExternalService1();
    private ExternalService2 externalService2 = new ExternalService2();

    public void doSomething1() {
        externalService1.doSomething();
    }

    public void doSomething2() {
        externalService2.doSomething();
    }
}
