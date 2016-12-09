/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.awt.Point;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Shelf;

/**
 *
 * @author farr3ll
 */
public class ShelfIT {

    public ShelfIT() {
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
     * Test of getshelfBase method, of class Shelf.
     */
    @Test
    public void testGetshelfBase() {
        System.out.println("getshelfBase");
        Shelf instance = null;
        Point expResult = null;
        Point result = instance.getshelfBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Shelf.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult = 0;
        int result = Shelf.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class Shelf.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String s = "";
        int quantity = 0;
        Shelf instance = null;
        boolean expResult = false;
        boolean result = instance.addItem(s, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Shelf.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String s = "";
        Shelf instance = null;
        boolean expResult = false;
        boolean result = instance.removeItem(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsItem method, of class Shelf.
     */
    @Test
    public void testContainsItem() {
        System.out.println("containsItem");
        String s = "";
        Shelf instance = null;
        boolean expResult = false;
        boolean result = instance.containsItem(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Shelf.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Shelf instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
