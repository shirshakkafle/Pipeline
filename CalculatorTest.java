package org.example;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    Calcilator calc;
    public CalculatorTest(){

    }
    @BeforeClass
    public static void setUpclass() throws Exception{

    }
    @AfterClass
    public static void tearDownclass() throws Exception{

    }
    @BeforeMethod
    public void setUpMethod() throws Exception{
        calc = new Calcilator();
    }
    @AfterMethod
    public void tearDownMethod() throws Exception{

    }

    @Test
    public void testAdd(){
        assertEquals(calc.add(2,4),6);
    }
    @Test
    public  void testMultiply(){
        assertEquals(calc.multiply(3,2),6);
    }
}
