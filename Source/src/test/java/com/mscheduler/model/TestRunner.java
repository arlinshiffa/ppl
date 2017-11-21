/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Spectre
 */
public class TestRunner {

    public static void main(String[] args) {
       Result invitationTestResult = JUnitCore.runClasses(Invitation.class);

        System.out.println("---Test Invitation---");
        for (Failure failure : invitationTestResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(invitationTestResult.wasSuccessful());
        
        Result dateRangeTestResult = JUnitCore.runClasses(DateRange.class);

        System.out.println("---Test DateRange---");
        for (Failure failure : dateRangeTestResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(dateRangeTestResult.wasSuccessful());
        
         
    }
}
