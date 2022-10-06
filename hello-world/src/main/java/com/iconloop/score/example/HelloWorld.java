package com.iconloop.score.example;

import score.Context;
import score.annotation.External;
import score.annotation.Payable;

public class HelloWorld {
    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    @External()
    public void setName(String name) {
        this.name = name;
    }

    @External(readonly=true)
    public String name() {
        return name;
    }

    @External(readonly=true)
    public String getGreeting() {
        String msg = "Hello " + name + "!";
        Context.println(msg);
        return msg;
    }
}