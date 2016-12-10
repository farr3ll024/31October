package testpackage;

/**
 * @author Sam Barth
 * @author farr3ll
 *
 * RobotMasterIT is a JUnit testing class for the RobotMaster class.
 */
import java.awt.Point;
import java.util.List;
import java.util.LinkedList;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import production.*;

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
    @Test
    public void testTick() {
        System.out.println("tick"); 
        MockFloor f = new MockFloor();
        Belt b = new Belt(16);
        MockInventory i = new MockInventory();
        Inventory in = new Inventory(f);
        MockOrders o = new MockOrders();
        Orders or = new Orders(in);
        Picker p = new Picker(or, b, in);
        RobotMaster instance = new RobotMaster(1, f, i, o, p);
        for (int j = 0; j < 10; j++) {
            instance.tick(j);
            ArrayList<Point> robotLocation = new ArrayList<>();
            robotLocation = instance.getRobotLocations();
            assertNotEquals(robotLocation.size(), 0);
            System.out.println(robotLocation.size());
            for (Point x : robotLocation) {
                System.out.println(x.toString());
            }
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The number of robots returned from 'getRobotLocations' was 0");
    }

}
