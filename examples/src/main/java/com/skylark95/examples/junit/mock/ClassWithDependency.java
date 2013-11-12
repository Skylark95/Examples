package com.skylark95.examples.junit.mock;

public class ClassWithDependency {
    
    private Dependency dependency;

    public ClassWithDependency(Dependency dependency) {
        this.dependency = dependency;
    }
    
    public String getResponseFromDependency() {
        return dependency.getResponse();
    }

}
