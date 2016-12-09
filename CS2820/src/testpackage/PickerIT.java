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
import production.Picker;
import production.Shelf;

/**
 *
 * @author farr3ll
 */
public class PickerIT {

    public PickerIT() {
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
     * Test of pick method, of class Picker.
     */
    @Test
    public void testPick() {
        System.out.println("pick");
        String item = "";
        Picker instance = null;
        instance.pick(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeOrder method, of class Picker.
     */
    @Test
    public void testCompleteOrder() {
        System.out.println("completeOrder");
        Picker instance = null;
        instance.completeOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deliverShelf method, of class Picker.
     */
    @Test
    public void testDeliverShelf() {
        System.out.println("deliverShelf");
        Shelf s = null;
        Picker instance = null;
        instance.deliverShelf(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
