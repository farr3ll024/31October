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
import production.Orders;
import production.Shelf;

/**
 *
 * @author farr3ll
 */
public class OrdersIT {

    public OrdersIT() {
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
     * Test of getNextOrder method, of class Orders.
     */
    @Test
    public void testGetNextOrder() {
        System.out.println("getNextOrder");
        Orders instance = null;
        Order expResult = null;
        Order result = instance.getNextOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shelfToFetch method, of class Orders.
     */
    @Test
    public void testShelfToFetch() {
        System.out.println("shelfToFetch");
        Orders instance = null;
        Shelf expResult = null;
        Shelf result = instance.shelfToFetch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doc method, of class Orders.
     */
    @Test
    public void testDoc() {
        System.out.println("doc");
        Orders instance = null;
        instance.doc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
