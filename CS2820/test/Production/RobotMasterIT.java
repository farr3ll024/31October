/**
 * @author Sam Barth
 * @author farr3ll
 * 
 * RobotMasterIT is a JUnit testing class for the RobotMaster class.
 */
package Production;

import java.awt.Point;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;


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
     * Test of tick method, of class RobotMaster.
     */
    @Ignore
    public void testTick() {
        System.out.println("tick");
        //List l = new List<>();
        Floor f = new Floor(16,16);
        //Inventory i = new Inventory;
        //Robot instance = new Robot()
        int i = 0;
        RobotMaster instance = null;
        instance.tick(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
