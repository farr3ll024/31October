/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import Production.Order;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
     * Test of getItemInfo method, of class Order.
     */
    @Test
    public void testGetItemInfo() {
        System.out.println("getItemInfo");
        Order instance = null;
        ArrayList<Integer> expResult = null;
        //ArrayList<Integer> result = instance.getItemInfo();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToBin method, of class Order.
     */
    @Test
    public void testAddToBin() {
        System.out.println("addToBin");
        String item = "";
        Order instance = null;
        //instance.addToBin(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shelfReady method, of class Order.
     */
    @Test
    public void testShelfReady() {
        System.out.println("shelfReady");
        Order instance = null;
        Boolean expResult = null;
        //Boolean result = instance.shelfReady();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of binFilled method, of class Order.
     */
    @Test
    public void testBinFilled() {
        System.out.println("binFilled");
        Order instance = null;
        Boolean expResult = null;
        //Boolean result = instance.binFilled();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelfNumber method, of class Order.
     */
    @Test
    public void testGetShelfNumber() {
        System.out.println("getShelfNumber");
        Order instance = null;
        int expResult = 0;
        //int result = instance.getShelfNumber();
        //assertEquals(expResult, result);
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

    /**
     * Test of randomAddress method, of class Order.
     */
    @Test
    public void testRandomAddress() {
        System.out.println("randomAddress");
        Order instance = null;
        String expResult = "";
        //String result = instance.randomAddress();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class Order.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        int iteration = 0;
        Order instance = null;
        //instance.tick(iteration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doc method, of class Order.
     */
    @Test
    public void testDoc() {
        System.out.println("doc");
        Order instance = null;
        //instance.doc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
