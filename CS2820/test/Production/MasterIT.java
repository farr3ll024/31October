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
 * @author : Blaise Reints
 * @author : farr3ll024 (aka Blaise)
 * @verson Last modified: November 20
 *
 * purpose - test the master class
 */
public class MasterIT {

    public MasterIT() {
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
     * Test of startSim method, of class Master.
     */
    @Test
    public void testStartSim() {
        System.out.println("startSim");
        Master instance = new Master();
        instance.startSim();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Master.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Master instance = new Master();
        Boolean expResult = null;
        Boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endSim method, of class Master.
     */
    @Test
    public void testEndSim() {
        System.out.println("endSim");
        Master instance = new Master();
        instance.endSim();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIteration method, of class Master.
     */
    @Test
    public void testGetIteration() {
        System.out.println("getIteration");
        Master instance = new Master();
        int expResult = 0;
        int result = instance.getIteration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Master.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Master.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
