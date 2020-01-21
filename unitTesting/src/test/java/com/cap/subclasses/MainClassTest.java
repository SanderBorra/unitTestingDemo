package com.cap.subclasses;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class MainClassTest {
    @Mock
    private SubClass subClass;

    @InjectMocks
    private MainClass mainClass;

    @Test
    public void happyFlow() {
        Mockito.when(subClass.actualWork()).thenReturn(43);
        int result = mainClass.doWork();
        Assert.assertEquals(43, result);
    }

    @Test(expected = Exception.class)
    public void unHappyFlow() {
        Mockito.when(subClass.actualWork()).thenThrow(new Exception());
        mainClass.doWork();
    }
}
