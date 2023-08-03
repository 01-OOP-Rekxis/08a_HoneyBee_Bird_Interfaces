package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String hasFeathers() {
        return "I'm a Bird and I have feathers!";
    }

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

}
