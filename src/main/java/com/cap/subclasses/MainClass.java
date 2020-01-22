package com.cap.subclasses;

public class MainClass {
    SubClass subClass;

    protected MainClass(SubClass subClass) {
        this.subClass = subClass;
    }

    public MainClass(){
        this(new SubClass());
    }

    public int doWork() {
        return privateDoWork();
    }

    private int privateDoWork() {
        return subClass.actualWork();
    }
}
