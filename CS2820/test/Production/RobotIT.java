/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Production;

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
public class RobotIT {

    public RobotIT() {
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
     * Test of returnToCharger method, of class Robot.
     */
    @Test
    public void testReturnToCharger() {
        System.out.println("returnToCharger");
        Robot instance = null;
        instance.returnToCharger();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetchItem method, of class Robot.
     */
    @Test
    public void testFetchItem() {
        System.out.println("fetchItem");
        int shelfLocation = 0;
        Robot instance = null;
        instance.fetchItem(shelfLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stockItem method, of class Robot.
     */
    @Test
    public void testStockItem() {
        System.out.println("stockItem");
        int shelfLocation = 0;
        Robot instance = null;
        instance.stockItem(shelfLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Robot.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Robot instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Robot.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Robot instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTraversed method, of class Robot.
     */
    @Test
    public void testGetDistanceTraversed() {
        System.out.println("getDistanceTraversed");
        Robot instance = null;
        int expResult = 0;
        int result = instance.getDistanceTraversed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIdle method, of class Robot.
     */
    @Test
    public void testIsIdle() {
        System.out.println("isIdle");
        Robot instance = null;
        boolean expResult = false;
        boolean result = instance.isIdle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shelfCoupled method, of class Robot.
     */
    @Test
    public void testShelfCoupled() {
        System.out.println("shelfCoupled");
        Robot instance = null;
        boolean expResult = false;
        boolean result = instance.shelfCoupled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coupleShelf method, of class Robot.
     */
    @Test
    public void testCoupleShelf() {
        System.out.println("coupleShelf");
        Robot instance = null;
        instance.coupleShelf();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onOrderMission method, of class Robot.
     */
    @Test
    public void testOnOrderMission() {
        System.out.println("onOrderMission");
        Robot instance = null;
        boolean expResult = false;
        boolean result = instance.onOrderMission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onStockMission method, of class Robot.
     */
    @Test
    public void testOnStockMission() {
        System.out.println("onStockMission");
        Robot instance = null;
        boolean expResult = false;
        boolean result = instance.onStockMission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
