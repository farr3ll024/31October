package testpackage;

/**
 * @author Sam Barth
 * @author farr3ll
 *
 * date last modified: 11/30/2016
 *
 * RobotIT is a JUnit testing class for the Robot class.
 */


import production.Robot;
import java.awt.Point;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

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
    @Ignore
    public void testReturnToCharger() {
        System.out.println("returnToCharger");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        instance.returnToCharger();
        Point expResult = new Point(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Robot.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result, 0.01);
        fail("getX() returned " + result);
    }

    /**
     * Test of getY method, of class Robot.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        int expResult = 0;
        int result = instance.getY();
        assertEquals((int) expResult, (int) result);
        fail("getY() returned " + result);
    }

    /**
     * Test of getDistanceTraversed method, of class Robot.
     */
    @Ignore
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
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        boolean expResult = true;
        boolean result = instance.isIdle();
        assertEquals(expResult, result);
        fail("isIdle returned" +result+ "when initialized.");
    }

    /**
     * Test of shelfCoupled method, of class Robot.
     */
    @Ignore
    public void testShelfCoupled() {
        System.out.println("shelfCoupled");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        boolean expResult = false;
        boolean result = instance.shelfCoupled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("shelfCoupled returned true when intialized.");
    }

    /**
     * Test of coupleShelf method, of class Robot.
     */
    @Test
    public void testCoupleShelf() {
        System.out.println("coupleShelf");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        instance.coupleShelf();
        boolean expResult = true;
        boolean result = instance.shelfCoupled();
        assertEquals((boolean) expResult, (boolean) result);
        fail("After calling coupleShelf, shelfCouple() resturns " + result);
    }

    /**
     * Test of onOrderMission method, of class Robot.
     */
    @Test
    public void testOnOrderMission() {
        System.out.println("onOrderMission");
        Point p = new Point(0, 0);
        MockFloor f = new MockFloor();
        Robot instance = new Robot(p, f);
        boolean expResult = false;
        boolean result = instance.onOrderMission();
        assertEquals(expResult, result);
        fail("onOrderMission returns " + result + " when new Robot is initialized.");
    }

    /**
     * 
     */
    @Test
    public void testMove(){
        System.out.println("move");
        MockFloor f = new MockFloor();
        Point p = new Point(0,0);
        Point destination = new Point(5,5);
        Robot instance = new Robot(p, f);
        instance.assignMission("Order", destination);
        for (int i = 0; i < 20 ;i++){
            instance.move(true);
        }
    }
}
