/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.util.LinkedList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spectre
 */
public class InvitationTest {
    
    public InvitationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMeeting_id method, of class Invitation.
     */
    @Test
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        int expResult = 28;
        Invitation instance = new Invitation(expResult, "user1@ms.com");
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMeeting_id method, of class Invitation.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 28;
        Invitation instance = new Invitation();
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTo method, of class Invitation.
     */
    @Test
    public void testGetTo() {
        System.out.println("getTo");
        Invitation instance = new Invitation(28, "test");
        String expResult = "test";
        String result = instance.getTo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTo method, of class Invitation.
     */
    @Test
    public void testSetTo() {
        System.out.println("setTo");
        String to = "testSet";
        Invitation instance = new Invitation();
        instance.setTo(to);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAvailability method, of class Invitation.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        Invitation instance = new Invitation();
        List<DateRange> expResult =null;
        List<DateRange> result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAvailability method, of class Invitation.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        List<DateRange> availability = new LinkedList<>();
        Invitation instance = new Invitation();
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addAvailability method, of class Invitation.
     */
    @Test
    public void testAddAvailability() {
        System.out.println("addAvailability");
        DateRange availability = new DateRange("12/12/2017 09 - 13/12/2017 09");
        System.out.println(availability.getDate_end());
        Invitation instance = new Invitation(1, "test");
        instance.addAvailability(availability);
        assertNotNull(this);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getStatus method, of class Invitation.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Invitation instance = new Invitation();
        instance.setStatus(InvitationStatus.accepted);
        InvitationStatus expResult = InvitationStatus.accepted ;
        InvitationStatus result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setStatus method, of class Invitation.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        InvitationStatus status = InvitationStatus.accepted;
        Invitation instance = new Invitation();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
