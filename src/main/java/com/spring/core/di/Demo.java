package com.spring.core.di;
class DependencyA{

}
class DependencyB{

}
class DependencyC{

}
public class Demo {
    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;
// Constructor DI --> Mandatory DI---> becoz During bean creation itself DI takes place
    public Demo(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
        this.dependencyC = dependencyC;
    }
}
