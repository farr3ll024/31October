/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Order;
import production.OrderGenerator;

/**
 *
 * @author farr3ll
 */
public class OrderGeneratorIT {

    public OrderGeneratorIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getOrder method, of class OrderGenerator.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        OrderGenerator instance = new OrderGenerator();
        Order expResult = null;
        Order result = instance.getOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
