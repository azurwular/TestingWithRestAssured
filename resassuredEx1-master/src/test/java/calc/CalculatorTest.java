/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class CalculatorTest
{
    
    public CalculatorTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd()
    {
        System.out.println("add");
        int i1 = 1;
        int i2 = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @org.junit.Test
    public void testSub()
    {
        System.out.println("sub");
        int i1 = 5;
        int i2 = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.sub(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @org.junit.Test
    public void testMul()
    {
        System.out.println("mul");
        int i1 = 5;
        int i2 = 2;
        Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.mul(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calculator.
     */
    @org.junit.Test
    public void testDiv()
    {
        System.out.println("div");
        int i1 = 10;
        int i2 = 2;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.div(i1, i2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculator.
     */
    @org.junit.Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
