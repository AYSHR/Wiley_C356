package com.wiley.springcore.factorymethods;

public class SingletonFooFactory {
// static factory method w/o arguments
    private static final SingletonFooFactory INSTANCE = new SingletonFooFactory();
    
    public static SingletonFooFactory createInstance() {
        return INSTANCE;
    }
    
    
}