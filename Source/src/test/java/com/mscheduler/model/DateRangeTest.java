/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import com.mscheduler.Config;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
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
public class DateRangeTest {
    
    public DateRangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of dateToLocalDateTime method, of class DateRange.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date date = new Date(23,12,2017);
        DateRange instance = new DateRange("12/12/2017 09 - 13/12/2017 09");
        LocalDateTime expResult = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime result = instance.dateToLocalDateTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of localDateTimeToDate method, of class DateRange.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        DateRange instance = new DateRange();
        Date expResult = Date.from(LocalDateTime.ofInstant(new Date(2017,12,12).toInstant(), ZoneId.systemDefault()).atZone(ZoneId.systemDefault()).toInstant());
        Date result = instance.localDateTimeToDate(LocalDateTime.ofInstant(new Date(2017,12,12).toInstant(), ZoneId.systemDefault()));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getDate_start method, of class DateRange.
     */
    @Test
    public void testGetDate_start() {
        System.out.println("getDate_start");
        Date start=new Date(2017,12,12);
        Date end=new Date(2017,12,13);
        Date expResult = start;
        Date result = new DateRange(start, end).getDate_start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDate_start method, of class DateRange.
     */
    @Test
    public void testSetDate_start() {
        System.out.println("setDate_start");
        Date date_start = new Date();
        DateRange instance = new DateRange();
        instance.setDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDate_end method, of class DateRange.
     */
    @Test
    public void testGetDate_end() {
        System.out.println("getDate_end");
        Date start=new Date(2017,12,12);
        Date end=new Date(2017,12,13);
        DateRange instance = new DateRange(start, end);
        Date expResult = end;
        Date result = instance.getDate_end();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDate_end method, of class DateRange.
     */
    @Test
    public void testSetDate_end() {
        System.out.println("setDate_end");
        Date date_end = null;
        DateRange instance = new DateRange();
        instance.setDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateStart method, of class DateRange.
     */
    @Test
    public void testLocalDateStart() {
        System.out.println("localDateStart");
        Date start=new Date(2017,12,12);
        Date end=new Date(2017,12,13);
        DateRange instance = new DateRange(start, end);
        LocalDateTime expResult = instance.dateToLocalDateTime(start);
        LocalDateTime result = instance.localDateStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setLocalDate_start method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_start() {
        System.out.println("setLocalDate_start");
        DateRange instance = new DateRange();
        Date start=new Date(2017,12,12);
        LocalDateTime date_start=instance.dateToLocalDateTime(start);
        instance.setLocalDate_start(date_start);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of localDateEnd method, of class DateRange.
     */
    @Test
    public void testLocalDateEnd() {
        System.out.println("localDateEnd");
        Date start=new Date(2017,12,12);
        Date end=new Date(2017,12,13);
        DateRange instance = new DateRange(start, end);
        LocalDateTime expResult = instance.dateToLocalDateTime(end);
        LocalDateTime result = instance.localDateEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLocalDate_end method, of class DateRange.
     */
    @Test
    public void testSetLocalDate_end() {
        System.out.println("setLocalDate_end");
        Date end=new Date(2017,12,13);
        DateRange instance = new DateRange();
        LocalDateTime date_end = instance.dateToLocalDateTime(end);
        instance.setLocalDate_end(date_end);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of length method, of class DateRange.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        DateRange instance = new DateRange();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isBetweenAny method, of class DateRange.
     */
    @Test
    public void testIsBetweenAny() {
        System.out.println("isBetweenAny");
        List<DateRange> date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isBetweenAny(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isDateRangeBetween method, of class DateRange.
     */
    @Test
    public void testIsDateRangeBetween() {
        System.out.println("isDateRangeBetween");
        DateRange date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateRangeBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isDateBetween method, of class DateRange.
     */
    @Test
    public void testIsDateBetween() {
        System.out.println("isDateBetween");
        LocalDateTime date = null;
        DateRange instance = new DateRange();
        boolean expResult = false;
        boolean result = instance.isDateBetween(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class DateRange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Date start=new Date(2017,12,12);
        Date end=new Date(2017,12,13);
        DateRange instance = new DateRange(start, end);
        String expResult = instance.dateToLocalDateTime(start).format(Config.DATETIME_OUTPUT_FORMATTER);
        expResult+=" - "+instance.dateToLocalDateTime(end).format(Config.DATETIME_OUTPUT_FORMATTER);
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString2 method, of class DateRange.
     */
    @Test
    public void testToString2() {
        System.out.println("toString2");
        DateRange instance = new DateRange();
        String expResult = instance.toString();
        String result = instance.toString2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isOverlap method, of class DateRange.
     */
    @Test
    public void testIsOverlap() {
        System.out.println("isOverlap");
        DateRange dr1=new DateRange(new Date(2017,12,12), new Date(2017, 12, 13));
        DateRange dr2=new DateRange(new Date(2017, 12, 13), new Date(2017,12,14));
        boolean result=dr1.isDateRangeBetween(dr2)||dr1.isDateBetween(dr2.localDateStart())||dr1.isDateBetween(dr2.localDateEnd());
        assertEquals(result, dr1.isOverlap(dr2));
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mergeDate method, of class DateRange.
     */
    @Test
    public void testMergeDate() {
        System.out.println("mergeDate");
        DateRange dr=new DateRange(new Date(2017, 12, 12), new Date(2017, 12, 15));
        DateRange dr1=new DateRange(new Date(2017, 12, 12), new Date(2017, 12, 14));
        DateRange dr2=new DateRange(new Date(2017, 12, 14),new Date(2017, 12, 15));
        dr1.mergeDate(dr2);
        assertTrue(dr.localDateStart().equals(dr1.localDateStart())&&dr.localDateEnd().equals(dr1.localDateEnd()));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isOverlapAny method, of class DateRange.
     */
    @Test
    public void testIsOverlapAny() {
        System.out.println("isOverlapAny");
        List<DateRange> conflicted_meeting_time = new LinkedList<DateRange>();
        conflicted_meeting_time.add(new DateRange(new Date(2017, 12, 12), new Date(2017, 12, 13)));
        conflicted_meeting_time.add(new DateRange(new Date(2017, 12, 14),new Date(2017, 12, 15)));
        boolean expResult = false;
        DateRange instance=new DateRange();
        boolean result = instance.isOverlapAny(conflicted_meeting_time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    private Date LocalDateTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
