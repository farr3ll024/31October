/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import production.Belt;
import production.Bin;

/**
 *
 * @author farr3ll
 */
public class BeltIT {

    public BeltIT() {
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
     * Test of deliverBin method, of class Belt.
     */
    @Test
    public void testDeliverBin() {
        System.out.println("deliverBin");
        Bin b = null;
        Belt instance = null;
        instance.deliverBin(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class Belt.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        int iteration = 0;
        Belt instance = null;
        instance.tick(iteration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doc method, of class Belt.
     */
    @Test
    public void testDoc() {
        System.out.println("doc");
        Belt instance = null;
        instance.doc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
