/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC315TermProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author jjackso3
 */
public class PopulateTable extends CreateTable {
    
    public static void PopulateTable(){
        
    }
    
    public void populateAirportTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('LAX', 'Los Angeles International Airport', " +
            "'3106465252', " +
            "'Los Angeles', 'United States')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('DFW', 'Dallas/Fortworth International Airport', " +
            "'9729738888', " +
            "'Dallas', 'United States')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('DEN', 'Denver International Airport', " +
            "'3033422000', " +
            "'Denver', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('LIT', 'Little Rock International Airport', " +
            "'5013723439', " +
            "'Little Rock', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('OGG', 'Kahului Airport', " +
            "'8088723830', " +
            "'Kahului', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('JFK', 'John F. Kennedy International Airport', " +
            "'7182444444', " +
            "'Jamaica', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('ATL', 'Hartsfield Jackson International Airport', " +
            "'4045306600', " +
            "'Atlanta', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('MSY', 'Louis Armstrong International Airport', " +
            "'5044640831', " +
            "'Kenner', 'United States')");
        
         stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('PHX', 'Phoenix Sky Harbor International Airport', " +
            "'6022733300', " +
            "'Phoenix', 'United States')");
         
         stmt.executeUpdate(
            "insert into " + dbName +
            ".Airport " +
            "values('OKC', 'Will Rogers World Airport', " +
            "'4053163200', " +
            "'Oklahoma City', 'United States')");
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
        public void populateAirlineTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airline " +
            "values('Delta Airlines', '4045152600', " +
            "'1030', " +
            "'Delta Blvd', 'Atlanta', 'GA', 'United States')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airline " +
            "values('United Airlines', '3129978000', " +
            "'77', " +
            "'West Wacker Dr', 'Chicago', 'IL', 'United States')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airline " +
            "values('Southwest Airlines', '2147924000', " +
            "'2702', " +
            "'Love Field Dr', 'Dallas', 'TX', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airline " +
            "values('Continental Airlines', '7133245000', " +
            "'900', " +
            "'Grand Plaza Dr', 'Houston', 'TX', 'United States')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Airline " +
            "values('American Airlines', '8179631234', " +
            "'4333', " +
            "'Amon Carter Blvd', 'Fort Worth', 'TX', 'United States')");
        
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
        
        public void populatePlaneTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
        
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('22', '159', " +
            "'BOEING 757', " +
            "'TurboJet', '23120')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('16', '48', " +
            "'MD 88', " +
            "'TurboJet', '24350')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('9', '48', " +
            "'Embraer E170', " +
            "'TurboJet', '13645')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('40', '178', " +
            "'BOEING 767', " +
            "'TurboJet', '56487')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('12', '52', " +
            "'Embraer 175', " +
            "'TurboJet', '17895')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('16', '129', " +
            "'MD 90', " +
            "'TurboJet', '47856')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('12', '52', " +
            "'CRJ 900', " +
            "'TurboJet', '85462')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Plane " +
            "values('45', '188', " +
            "'BOEING 777', " +
            "'TurboJet', '65852')");
        
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
    
    public void populateFlightTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
        Random gen = new Random();
    
        try {
        stmt = conn.createStatement();
        int availSeats = gen.nextInt(182);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('4690', 890.20, " +
            "333.20, " + availSeats + ", " +
            "'2006/12/31', '11:25:25', '15:17:30', 'DFW', 'LAX', 'Delta Airlines', '23120')");
        
        availSeats = gen.nextInt(64);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('3240', 950.50, 423.65, " + availSeats + ", " +
            "'2006/12/31', " +
            "'12:30:45', '16:30:40', 'DFW', 'LAX', 'Southwest Airlines', '24350')");
        
        availSeats = gen.nextInt(57);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('2530', 930.45, 525.75, " + availSeats + ", " +
            "'2007/3/12', " +
            "'05:45:20', '09:50:40', 'DFW', 'LAX', 'American Airlines', '13645')");
        
        availSeats = gen.nextInt(218);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('1230', 652.15, 212.35, " + availSeats + ", " +
            "'2007/3/12', " +
            "'10:45:23', '14:45:19', 'LAX', 'OGG', 'Continental Airlines', '56487')");
        
        availSeats = gen.nextInt(64);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('0380', 547.44, 187.25, " + availSeats + ", " +
            "'2007/4/25', " +
            "'20:35:55', '21:55:13', 'ATL', 'MSY', 'Continental Airlines', '17895')");
        
        availSeats = gen.nextInt(145);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('2478', 1556.38, 958.23, " + availSeats + ", " +
            "'2007/5/21', " +
            "'05:13:58', '18:23:43', 'JFK', 'OGG', 'United Airlines', '47856')");
        
        availSeats = gen.nextInt(64);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('0987', 790.23, 523.92, " + availSeats + ", " +
            "'2006/12/31', " +
            "'05:25:12', '08:23:43', 'DFW', 'ATL', 'United Airlines', '85462')");
        
        availSeats = gen.nextInt(233);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('2497', 735.18, 390.13, " + availSeats + ", " +
            "'2006/12/31', " +
            "'16:15:54', '22:45:21', 'LAX', 'OGG', 'American Airlines', '65852')");
        
        availSeats = gen.nextInt(145);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('1325', 700.23, 501.91, " + availSeats + ", " +
            "'2006/12/31', " +
            "'01:26:32', '04:21:13', 'DFW', 'PHX', 'American Airlines', '17895')");
        
        availSeats = gen.nextInt(218);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('0587', 695.45, 412.65, " + availSeats + ", " +
            "'2006/12/31', " +
            "'04:58:52', '08:45:43', 'DFW', 'MSY', 'Continental Airlines', '65852')");
        
        availSeats = gen.nextInt(64);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('0150', 823.85, 512.67, " + availSeats + ", " +
            "'2006/12/31', " +
            "'12:53:18', '17:56:23', 'DFW', 'LIT', 'United Airlines', '85462')");
        
        availSeats = gen.nextInt(57);
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Flight " +
            "values('2485', 664.55, 399.99, " + availSeats + ", " +
            "'2006/12/31', " +
            "'14:42:19', '19:32:12', 'DFW', 'DEN', 'Delta Airlines', '24350')");
        }  
        
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
    
    public void populateCustomerTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('j54128963', 'John', 'K', 'Johnson', " +
            "'547', " +
            "'Main Str', '71111', '3185746254')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('j78541269', 'Jim', 'F', 'Smith', " +
            "'47589', " +
            "'Hwy 157', '56014', '2541024785')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('k58746325', 'Kelly', 'R', 'Kennedy', " +
            "'102', " +
            "'Spruce Lane', '78463', '2548526547')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('m47125638', 'Mark', 'E', 'Marshal', " +
            "'3456', " +
            "'Boulder Dr', '35289', '6459586320')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('c63458912', 'Charles', 'P', 'Charleston', " +
            "'741', " +
            "'Cornerstone Blvd', '56237', '2302589652')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('m54793841', 'Mandy', 'L', 'Morrison', " +
            "'645', " +
            "'Applewood Trail', '85412', '4523657854')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('r63285412', 'Ron', 'D', 'Richardson', " +
            "'321', " +
            "'Oak Str', '45687', '2545687523')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('j56247856', 'Jennifer', 'J', 'Jackson', " +
            "'421', " +
            "'Jennifer Lane', '85241', '9853627426')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('p63524854', 'Pam', 'T', 'Adkins', " +
            "'89657', " +
            "'Wildvine Trail', '65874', '6582145638')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Customer " +
            "values('p65874523', 'Paul', 'F', 'Paulson', " +
            "'9635', " +
            "'Greylake Circle', '71067', '3185625478')");
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
    
        public void populatePmtMethodTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('4125896325874125', 'VISA', 'j54128963')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('6658455213588963', 'VISA', 'j78541269')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('5423669854112568', 'Mastercard', 'k58746325')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('4157896652354255', 'Mastercard', 'm47125638')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('5874441196358522', 'Discover', 'c63458912')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('2365547896533321', 'American Express', 'm54793841')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('8523332566987411', 'American Express', 'r63285412')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('6320225455896635', 'Discover', 'j56247856')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('4587963255224455', 'VISA', 'p63524854')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".PmtMethod " +
            "values('8536774489564712', 'Mastercard', 'j56247856')");
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }

        
        public void populateReservationTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Reservation " +
            "values('hjg563258', 'John', 'Harvey', '4125896325874125', " +
            "'j54128963')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Reservation " +
            "values('uyt235741', 'Gregg', 'Orr', '5423669854112568', " +
            "'k58746325')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Reservation " +
            "values('dsr586321', 'Brian', 'Haris', '2365547896533321', " +
            "'m54793841')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Reservation " +
            "values('ljy452103', 'Greg', 'Tilly', '4587963255224455', " +
            "'p63524854')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Reservation " +
            "values('fde745963', 'Vince', 'Anderson', '8536774489564712', " +
            "'j56247856')");
        
        
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
        
        public void populateFFMembershipTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
        try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('j54128963', 'Delta Airlines', 'jj6523547852')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('j78541269', 'United Airlines', 'js6585236974')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('m47125638', 'United Airlines', 'mm4152896347')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('c63458912', 'American Airlines', 'cc6537412895')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('r63285412', 'Southwest Airlines', 'rr4569321478')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FFMembership " +
            "values('j56247856', 'Continental Airlines', 'jj2354125896')");
        
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
        
        public void populateFlightLegTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
         try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('hjg563258', '4690', " +
            "'2006/12/31', 'Cleared')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('hjg563258', '2497', " +
            "'2006/12/31', 'Cleared')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('uyt235741', '3240', " +
            "'2006/12/31', 'Standby')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('dsr586321', '1230', " +
            "'2007/3/12', 'Cleared')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('dsr586321', '2530', " +
            "'2007/3/12', 'Cleared')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('ljy452103', '2478', " +
            "'2007/5/21', 'Standby')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".FlightLeg " +
            "values('dsr586321', '0987', " +
            "'2006/12/31', 'Cleared')");
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
        
        public void populatePreferencesTable() throws SQLException{
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        Statement stmt = null;
    
         try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Preferences " +
            "values('j54128963', 'hjg563258', " +
            "'Window', 'Vegan')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Preferences " +
            "values('k58746325', 'hjg563258', " +
            "'Isle', 'Kosher Only')");

        stmt.executeUpdate(
            "insert into " + dbName +
            ".Preferences " +
            "values('m54793841', 'dsr586321', " +
            "'Not Isle', 'Lactose Free')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Preferences " +
            "values('p63524854', 'ljy452103', " +
            "'Non Exit Row', 'Vegetarian')");
        
        stmt.executeUpdate(
            "insert into " + dbName +
            ".Preferences " +
            "values('j56247856', 'fde745963', " +
            "'Exit Row', 'Low Cal')");
   
        }  
    
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
        
        
}

