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
public class InvitationStatusTest {
    
    public InvitationStatusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class InvitationStatus.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        InvitationStatus[] expResult = null;
        InvitationStatus[] result = InvitationStatus.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class InvitationStatus.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        InvitationStatus expResult = null;
        InvitationStatus result = InvitationStatus.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
