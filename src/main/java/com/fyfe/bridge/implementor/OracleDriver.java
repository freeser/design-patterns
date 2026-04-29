package com.fyfe.bridge.implementor;

import com.fyfe.bridge.abstractor.Connection;
import com.fyfe.bridge.abstractor.Driver;

public class OracleDriver implements Driver {
    public Connection connect() {
        return new Connection("oracle");
    }
}
