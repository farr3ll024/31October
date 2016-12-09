/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Order;

/**
 *
 * @author farr3ll
 */
public class OrderIT {

    public OrderIT() {
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
     * Test of getNextItemInOrder method, of class Order.
     */
    @Test
    public void testGetNextItemInOrder() {
        System.out.println("getNextItemInOrder");
        Order instance = null;
        String expResult = "";
        String result = instance.getNextItemInOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reloadOrderStack method, of class Order.
     */
    @Test
    public void testReloadOrderStack() {
        System.out.println("reloadOrderStack");
        Order instance = null;
        boolean expResult = false;
        boolean result = instance.reloadOrderStack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderStackEmpty method, of class Order.
     */
    @Test
    public void testOrderStackEmpty() {
        System.out.println("orderStackEmpty");
        Order instance = null;
        boolean expResult = false;
        boolean result = instance.orderStackEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class Order.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Order instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderSize method, of class Order.
     */
    @Test
    public void testGetOrderSize() {
        System.out.println("getOrderSize");
        Order instance = null;
        int expResult = 0;
        int result = instance.getOrderSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShippingAddress method, of class Order.
     */
    @Test
    public void testGetShippingAddress() {
        System.out.println("getShippingAddress");
        Order instance = null;
        String expResult = "";
        String result = instance.getShippingAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
