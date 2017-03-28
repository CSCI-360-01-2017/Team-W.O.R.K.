/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MatthewKay
 */
public class SystemControllerTest {
    
    public SystemControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class SystemController.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SystemController.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of runSystem method, of class SystemController.
     */
    @Test
    public void testRunSystem() {
        System.out.println("runSystem");
        SystemController instance = new SystemController();
        instance.runSystem();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
