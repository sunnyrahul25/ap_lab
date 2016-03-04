/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localspider;

import java.io.File;
import java.util.Hashtable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sunnyrahul
 */
public class LocalSpiderTest {
    
    public LocalSpiderTest() {
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

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LocalSpider.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDirectorycrawler() {
        System.out.println("directorycrawler");
        File folder = null;
        Hashtable table = null;
        LocalSpider.directorycrawler(folder, table);
        fail("The test case is a prototype.");
    }
    
}
