package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I'm covered");
            return;
        }

        System.out.println("I'm not covered");
    }
}
