package com.cap.subclasses;

import org.apache.log4j.Logger;

public class MainClass {
	/**
	 * De MainClass gebruikt een subclass om het werk te doen
	 * 
	 */

	// Deze class heeft zijn eigen logger, volgens het formaat zoals gedefinieerd in
	// log4j.xml (zie src/main/resources)
	private static final Logger LOGGER = Logger.getLogger(MainClass.class);

	// Op dit moment niet geinitialiseerd
	private SubClass subClass;

	/*
	 * In plaats van /** (voor JavaDoc) wordt /* gebruikt.
	 * 
	 * Dit is een protected constructor, bedoeld voor test
	 */
	protected MainClass(SubClass subClass) {
		LOGGER.info("in MainClass");
		this.subClass = subClass;
	}

	/**
	 * Creer subclass voor later gebruik
	 */
	public MainClass() {

		this(new SubClass());
	}

	/**
	 * 
	 * @return integer waarde - het resultaat
	 *         <ul>
	 *         <li>Voorbeed van inline HTML voor documentatie</li>
	 *         </ul>
	 */
	public int doWork() {
		LOGGER.debug("in doWork");
		return privateDoWork();
	}

	/*
	 * Gewone documentatie - beschrijving algoritme
	 */
	private int privateDoWork() {
		LOGGER.warn("in privateDoWork");
		return subClass.actualWork();
	}
}
