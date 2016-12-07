/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import java.awt.Point;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Floor;

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
        //Floor.constructBelt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of constructShelf method, of class Floor.
     */
    @Test
    public void testConstructShelf() {
        System.out.println("constructShelf");
        //Floor.constructShelf();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelfLimit method, of class Floor.
     */
    @Test
    public void testGetShelfLimit() {
        System.out.println("getShelfLimit");
        //Floor instance = new Floor();
        int expResult = 0;
        //int result = instance.getShelfLimit();
        //assertEquals(expResult, result);
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
        Floor instance = new Floor(160, 200);
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
        //Floor.printMap();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFloorHeight method, of class Floor.
     */
    @Test
    public void testGetFloorHeight() {
        System.out.println("getFloorHeight");
        Floor instance = null;
        int expResult = 0;
        int result = instance.getFloorHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFloorWidth method, of class Floor.
     */
    @Test
    public void testGetFloorWidth() {
        System.out.println("getFloorWidth");
        Floor instance = null;
        int expResult = 0;
        int result = instance.getFloorWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberOfShelves method, of class Floor.
     */
    @Test
    public void testNumberOfShelves() {
        System.out.println("numberOfShelves");
        Floor instance = null;
        int expResult = 0;
        int result = instance.numberOfShelves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharger method, of class Floor.
     */
    @Test
    public void testGetCharger() {
        System.out.println("getCharger");
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getCharger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReceiving method, of class Floor.
     */
    @Test
    public void testGetReceiving() {
        System.out.println("getReceiving");
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getReceiving();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShipping method, of class Floor.
     */
    @Test
    public void testGetShipping() {
        System.out.println("getShipping");
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getShipping();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPicker method, of class Floor.
     */
    @Test
    public void testGetPicker() {
        System.out.println("getPicker");
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getPicker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacker method, of class Floor.
     */
    @Test
    public void testGetPacker() {
        System.out.println("getPacker");
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getPacker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBelt method, of class Floor.
     */
    @Test
    public void testGetBelt_0args() {
        System.out.println("getBelt");
        Floor instance = null;
        Point[] expResult = null;
        Point[] result = instance.getBelt();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBelt method, of class Floor.
     */
    @Test
    public void testGetBelt_int() {
        System.out.println("getBelt");
        int beltNum = 0;
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getBelt(beltNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelf method, of class Floor.
     */
    @Test
    public void testGetShelf_0args() {
        System.out.println("getShelf");
        Floor instance = null;
        Point[] expResult = null;
        Point[] result = instance.getShelf();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShelf method, of class Floor.
     */
    @Test
    public void testGetShelf_int() {
        System.out.println("getShelf");
        int n = 0;
        Floor instance = null;
        Point expResult = null;
        Point result = instance.getShelf(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printStats method, of class Floor.
     */
    @Test
    public void testPrintStats() {
        System.out.println("printStats");
        Floor instance = null;
        instance.printStats();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Floor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //Floor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
