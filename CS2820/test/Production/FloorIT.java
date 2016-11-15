/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Production;

import java.awt.Point;
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
public class FloorIT {

    public FloorIT() {
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
     * Test of constructBelt method, of class Floor.
     */
    @Test
    public void testConstructBelt() {
        System.out.println("constructBelt");
        Floor.constructBelt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of constructShelf method, of class Floor.
     */
    @Test
    public void testConstructShelf() {
        System.out.println("constructShelf");
        Floor.constructShelf();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelfLimit method, of class Floor.
     */
    @Test
    public void testGetShelfLimit() {
        System.out.println("getShelfLimit");
        Floor instance = new Floor();
        int expResult = 0;
        int result = instance.getShelfLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelf method, of class Floor.
     */
    @Test
    public void testGetShelf() {
        System.out.println("getShelf");
        int n = 0;
        Floor instance = new Floor();
        Point expResult = null;
        Point result = instance.getShelf(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMap method, of class Floor.
     */
    @Test
    public void testPrintMap() {
        System.out.println("printMap");
        Floor.printMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
