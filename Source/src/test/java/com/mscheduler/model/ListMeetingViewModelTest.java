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
public class ListMeetingViewModelTest {
    
    public ListMeetingViewModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getMeeting_id method, of class ListMeetingViewModel.
     */
    @Test
    public void testGetMeeting_id() {
        System.out.println("getMeeting_id");
        ListMeetingViewModel instance = null;
        int expResult = 0;
        int result = instance.getMeeting_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_id method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 0;
        ListMeetingViewModel instance = null;
        instance.setMeeting_id(meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_title method, of class ListMeetingViewModel.
     */
    @Test
    public void testGetMeeting_title() {
        System.out.println("getMeeting_title");
        ListMeetingViewModel instance = null;
        String expResult = "";
        String result = instance.getMeeting_title();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeting_title method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeeting_title() {
        System.out.println("setMeeting_title");
        String meeting_title = "";
        ListMeetingViewModel instance = null;
        instance.setMeeting_title(meeting_title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeting_status method, of class ListMeetingViewModel.
     */
    @Test
    public void testGetMeeting_status() {
        System.out.println("getMeeting_status");
        ListMeetingViewModel instance = null;
        MeetingStatus expResult = null;
        MeetingStatus result = instance.getMeeting_status();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeetingStatus method, of class ListMeetingViewModel.
     */
    @Test
    public void testSetMeetingStatus() {
        System.out.println("setMeetingStatus");
        MeetingStatus meeting_status = null;
        ListMeetingViewModel instance = null;
        instance.setMeetingStatus(meeting_status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
