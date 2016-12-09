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
import production.Robot;
import production.Shelf;

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
     * Test of move method, of class Robot.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        boolean printTestLines = false;
        Robot instance = null;
        instance.move(printTestLines);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of assignMission method, of class Robot.
     */
    @Test
    public void testAssignMission() {
        System.out.println("assignMission");
        String mission = "";
        Shelf s = null;
        Robot instance = null;
        instance.assignMission(mission, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Robot.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Robot instance = null;
        Point expResult = null;
        Point result = instance.getLocation();
        assertEquals(expResult, result);
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
     * Test of uncoupleShelf method, of class Robot.
     */
    @Test
    public void testUncoupleShelf() {
        System.out.println("uncoupleShelf");
        Robot instance = null;
        instance.uncoupleShelf();
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

    /**
     * Test of getSpecialActionLog method, of class Robot.
     */
    @Test
    public void testGetSpecialActionLog() {
        System.out.println("getSpecialActionLog");
        Robot instance = null;
        String expResult = "";
        String result = instance.getSpecialActionLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
