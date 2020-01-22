package com.cap.subclasses;

import org.apache.log4j.Logger;

public class MainClass {
	private static final Logger LOGGER = Logger.getLogger(MainClass.class);
	
    SubClass subClass;

    protected MainClass(SubClass subClass) {
    	LOGGER.info("in MainClass");
        this.subClass = subClass;
    }

    public MainClass(){
    	
        this(new SubClass());
    }

    public int doWork() {
    	LOGGER.debug("in doWork");
        return privateDoWork();
    }

    private int privateDoWork() {
    	LOGGER.warn("in privateDoWork");
        return subClass.actualWork();
    }
}
