/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author farr3ll
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({testpackage.BeltIT.class, testpackage.OrdersIT.class, testpackage.RobotIT.class, testpackage.warehouse_swingIT.class, testpackage.OrderGeneratorIT.class, testpackage.FloorIT.class, testpackage.DocumentIT.class, testpackage.OrderIT.class, testpackage.ClockIT.class, testpackage.VisualizerIT.class, testpackage.FloorIT.class, testpackage.BinIT.class, testpackage.InventoryIT.class, testpackage.PickerIT.class, testpackage.MasterIT.class, testpackage.ShelfIT.class, testpackage.RobotMasterIT.class})
public class ProductionITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
