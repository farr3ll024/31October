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
public class InventoryIT {

    public InventoryIT() {
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
     * Test of data method, of class Inventory.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Inventory instance = null;
        instance.data();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class Inventory.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String itemName = "";
        int Qty = 0;
        Inventory instance = null;
        instance.removeItem(itemName, Qty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class Inventory.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String itemName = "";
        int Qty = 0;
        Inventory instance = null;
        instance.addItem(itemName, Qty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of outPutFile method, of class Inventory.
     */
    @Test
    public void testOutPutFile() {
        System.out.println("outPutFile");
        Inventory instance = null;
        instance.outPutFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkExist method, of class Inventory.
     */
    @Test
    public void testCheckExist() {
        System.out.println("checkExist");
        String itemName = "";
        int Qty = 0;
        Inventory instance = null;
        boolean expResult = false;
        boolean result = instance.checkExist(itemName, Qty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPosition method, of class Inventory.
     */
    @Test
    public void testReadPosition() {
        System.out.println("readPosition");
        String itemName = "";
        Inventory instance = null;
        //Point expResult = null;
        //Point result = instance.readPosition(itemName);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Inventory.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inventory.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class Inventory.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        int iteration = 0;
        Inventory instance = null;
        instance.tick(iteration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doc method, of class Inventory.
     */
    @Test
    public void testDoc() {
        System.out.println("doc");
        Inventory instance = null;
        instance.doc();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
