/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spectre
 */
public class ScheduleTest {
    
    public ScheduleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDate method, of class Schedule.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Meeting meetingIns = new Meeting();
        DateRange date = new DateRange();
        Schedule instance = new Schedule(meetingIns, date);
        DateRange expResult = null;
        DateRange result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Schedule.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        DateRange date = null;
        Schedule instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addImportantParticipant method, of class Schedule.
     */
    @Test
    public void testAddImportantParticipant() {
        System.out.println("addImportantParticipant");
        Schedule instance = null;
        instance.addImportantParticipant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addParticipant method, of class Schedule.
     */
    @Test
    public void testAddParticipant() {
        System.out.println("addParticipant");
        Schedule instance = null;
        instance.addParticipant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalParticipant method, of class Schedule.
     */
    @Test
    public void testGetTotalParticipant() {
        System.out.println("getTotalParticipant");
        Schedule instance = null;
        int expResult = 0;
        int result = instance.getTotalParticipant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class Schedule.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Schedule instance = null;
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
