/**
 * @author Sam Barth
 * 
 * Some basic unit tests for Robot and RobotMaster are provided below.
 */


package robotTest;
import org.junit.Assert;
import org.junit.Test;
import oct31.RobotMaster;

public class RobotTest {

	@Test
	public void initializeRobotMaster() {
		int numRobotsToTest = 1;
		RobotMaster r = new RobotMaster(numRobotsToTest);
		Assert.assertTrue(r.robotAvailable());
	}
}
