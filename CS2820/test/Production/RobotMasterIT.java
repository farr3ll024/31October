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
public class RobotMasterIT {

    public RobotMasterIT() {
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
     * Test of robotAvailable method, of class RobotMaster.
     */
    @Test
    public void testRobotAvailable() {
        System.out.println("robotAvailable");
        RobotMaster instance = null;
        boolean expResult = false;
        boolean result = instance.robotAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class RobotMaster.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        int i = 0;
        RobotMaster instance = null;
        instance.tick(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
