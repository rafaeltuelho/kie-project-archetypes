package com.redhat.demos;
import static org.junit.Assert.assertTrue;

import com.redhat.demos.model.Employee;

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
        Employee e = new Employee("John", "Smith");
        System.out.println(e);
        assertTrue( true );
    }
}
