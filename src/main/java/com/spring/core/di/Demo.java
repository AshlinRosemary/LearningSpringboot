package com.spring.core.di;
class DependencyA{
    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    private DependencyB dependencyB;
}
class DependencyB{
    private DependencyA dependencyA;

    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }
}
class DependencyC{

}
public class Demo {


    private DependencyC dependencyC;
/* Constructor DI --> Mandatory DI---> becoz During bean creation itself DI takes place
    public Demo(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
        this.dependencyC = dependencyC;
    }*/
/*Eg for Setter Injection
    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    public void setDependencyC(DependencyC dependencyC) {
        this.dependencyC = dependencyC;
    }*/
}
