/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author MatthewKay
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.csci360.alarmclock.ClockTest.class, com.csci360.alarmclock.RadioControllerTest.class, com.csci360.alarmclock.RadioTest.class, com.csci360.alarmclock.AlarmTest.class, com.csci360.alarmclock.SystemControllerTest.class})
public class AlarmclockSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
