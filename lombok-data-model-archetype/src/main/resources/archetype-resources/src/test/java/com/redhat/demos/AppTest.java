package com.redhat.demos;
import static org.junit.Assert.assertTrue;

import com.redhat.demos.model.DummyModel;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        DummyModel e = new DummyModel("John", "Smith");
        System.out.println(e);
        assertTrue( e.getFirstName().equals("John") );
    }
}
