/**
 * @author Sam Barth
 * @author farr3ll
 * 
 * RobotMasterIT is a JUnit testing class for the RobotMaster class.
 */
package ProductionTestPackage;

import Production.Floor;
import Production.RobotMaster;
import java.awt.Point;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
    @Test
    public void testTick() {
        System.out.println("tick");
        MockFloor f = new MockFloor();
        MockInventory i = new MockInventory();
        RobotMaster instance = new RobotMaster(1, f, i);
        for(int j = 0; j < 10 ; j++){
            instance.tick(j);
            ArrayList<Point> robotLocation = new ArrayList<>();
            robotLocation = instance.getRobotLocations();
            assertNotEquals(robotLocation.size(), 0);
            System.out.println(robotLocation.size());
            for(Point p : robotLocation){                
                System.out.println(p.toString());            
            }
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The number of robots returned from 'getRobotLocations' was 0");
    }

}
