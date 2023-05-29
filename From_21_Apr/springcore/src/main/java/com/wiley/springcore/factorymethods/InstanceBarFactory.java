package com.wiley.springcore.factorymethods;

public class InstanceBarFactory {

    public Bar createInstance(String name) {
        return new Bar(name);
    }
}
