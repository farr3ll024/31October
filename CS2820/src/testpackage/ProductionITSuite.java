/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import testpackage.FloorIT;
import testpackage.DocumentIT;
import testpackage.ClockIT;
import testpackage.BeltIT;
import testpackage.VisualizerIT;
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
@Suite.SuiteClasses({VisualizerIT.class, FloorIT.class, MasterIT.class, DocumentIT.class, BeltIT.class, ClockIT.class, OrdersIT.class, ProductionIT.class})
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