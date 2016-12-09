/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.awt.Point;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Bin;
import production.Order;

/**
 *
 * @author farr3ll
 */
public class BinIT {

    public BinIT() {
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
     * Test of addItem method, of class Bin.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String s = "";
        Bin instance = null;
        boolean expResult = false;
        boolean result = instance.addItem(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of binFull method, of class Bin.
     */
    @Test
    public void testBinFull() {
        System.out.println("binFull");
        Bin instance = null;
        boolean expResult = false;
        boolean result = instance.binFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContents method, of class Bin.
     */
    @Test
    public void testGetContents() {
        System.out.println("getContents");
        Bin instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getContents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBinOrder method, of class Bin.
     */
    @Test
    public void testGetBinOrder() {
        System.out.println("getBinOrder");
        Bin instance = null;
        Order expResult = null;
        Order result = instance.getBinOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBinLocation method, of class Bin.
     */
    @Test
    public void testGetBinLocation() {
        System.out.println("getBinLocation");
        Bin instance = null;
        Point expResult = null;
        Point result = instance.getBinLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBin method, of class Bin.
     */
    @Test
    public void testMoveBin() {
        System.out.println("moveBin");
        int x = 0;
        int y = 0;
        Bin instance = null;
        instance.moveBin(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
