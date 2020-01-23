package com.cap.subclasses;

// Static import allows you to use 'assertEquals' instead of 'Assert.assertEquals' 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/*
 * Use Mockito as helper to run JUnit test, implemented by annotation
 */
@RunWith(MockitoJUnitRunner.class)
public class MainClassTest {
	private static final int EXPECTED = 43;

	// Mockito simulates the subclass
	@Mock
	private SubClass subClass;

	// Create test subject & inject (by using the proper constructor) the mocked classes
	@InjectMocks
	private MainClass mainClass;

	// Assume an ideal world
	@Test
	public void happyFlow() {
		// Instruct mocked object to have particular behaviour
		when(subClass.actualWork()).thenReturn(EXPECTED);
		// Call method in class to test
		int actual = mainClass.doWork();
		// check expected result
		assertEquals(EXPECTED, actual);
	}

	// This test is expected to throw an exception
	@Test(expected = Exception.class)
	public void unHappyFlow() {
		// The mocked subclass method is instructed to throw an Exception
		when(subClass.actualWork()).thenThrow(new Exception());
		mainClass.doWork();
	}
}
