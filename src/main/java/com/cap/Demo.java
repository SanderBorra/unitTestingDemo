package com.cap;

import org.apache.log4j.Logger;

/*
 * Voorbeeld voor hoe je werkt met classes en subclasses
 * Uitgewerkt staat hoe je een test kan doen
 * Demonstratie van Logging
 */
import com.cap.subclasses.MainClass;

public class Demo {
	// Declareer een statische referentie voor een logger die schrijft voor deze class
	private static final Logger LOGGER = Logger.getLogger(Demo.class);

	/**
	 * Comment met /** betekent JavaDoc
	 * @param args 0 of meer argument strings
	 */
    public static void main(String[] args) {
    	// De JVM moet ruimte alloceren voor een object gedefinieerd volgens de class MainClass
        MainClass mainClass = new MainClass();
        // het gealloceerde object mainClass heeft een methode 'doWork' zonder argumenten die een integer waarde teruggeeft
		int result = mainClass.doWork();
		// Geruik de logger op 'info' niveau om de waarde te tonen
		LOGGER.info(result);
    }
}
