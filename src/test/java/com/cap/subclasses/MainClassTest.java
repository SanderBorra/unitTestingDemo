package com.cap.subclasses;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainClassTest {
	@Mock
	private SubClass subClass;

	@InjectMocks
	private MainClass mainClass;

	@Test
	public void happyFlow() {
		when(subClass.actualWork()).thenReturn(43);
		int result = mainClass.doWork();
		assertEquals(43, result);
	}

	@Test(expected = Exception.class)
	public void unHappyFlow() {
		when(subClass.actualWork()).thenThrow(new Exception());
		mainClass.doWork();
	}
}
