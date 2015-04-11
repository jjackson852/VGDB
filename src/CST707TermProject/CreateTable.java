/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CST707TermProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jjackso3
 */
public class CreateTable extends jdbc_example {

    public String dbName = "dbo"; 
    public String url = "jdbc:sqlserver://CSCPROJECTS:1433;databaseName=Database Engine;DatabaseName=team4; user=team4;password=team4";
    
    public static void CreateTable(){
        
    }
    
    public void createAirportTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Airport " +
                              "(AP_Intl_Code char(3) NOT NULL, " +
                              "Airport_Name varchar(45) NULL, " +
                              "Phone_# varchar(11) NULL, " +
                              "Airport_City varchar(25) NULL, " +
                              "Airport_Country varchar(25) NULL, " +
                              "PRIMARY KEY (AP_Intl_Code))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
  }
    
    public void createAirlineTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Airline " +
                              "(Airline_Name varchar(25) NOT NULL, " +
                              "HQ_Phone_# varchar(11) NULL, " +
                              "HQ_Str_# varchar(10) NULL, " +
                              "HQ_Str_Name varchar(25) NULL, " +
                              "HQ_City varchar(25) NULL, " +
                              "HQ_State_or_Province varchar(25) NULL, " +
                              "HQ_Country varchar(25) NULL, " +
                              "PRIMARY KEY (Airline_Name))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createPlaneTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Plane " +
                              "(FC_Capacity varchar(3) NULL, " +
                              "EC_Capacity varchar(3) NULL, " +
                              "Plane_Identity varchar(15) NULL, " +
                              "Plane_Type varchar(15) NULL, " +
                              "Aircraft_MSN varchar(15) NOT NULL, " +                      
                              "PRIMARY KEY (Aircraft_MSN))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createFlightTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Flight " +
                              "(Flight_No varchar(6) NOT NULL, " +
                              "First_Class_Price decimal(7,2) NULL, " +
                              "Econ_Class_Price decimal(7,2) NULL, " +
                              "Seats_Avail INT NULL," +
                              "Date date NOT NULL, " +
                              "Dept_Time time NULL, " +
                              "Arr_Time time NULL, " +
                              "Dept_AP_Intl_Code char(3) NOT NULL FOREIGN KEY REFERENCES Airport (AP_Intl_Code ), " +
                              "Arr_AP_Intl_Code char(3) NOT NULL FOREIGN KEY REFERENCES Airport (AP_Intl_Code ), " +
                              "Airline_Name varchar(25) NOT NULL FOREIGN KEY REFERENCES Airline (Airline_Name ), " +
                              "Aircraft_MSN varchar(15) NOT NULL FOREIGN KEY REFERENCES Plane (Aircraft_MSN ), " +
                              "PRIMARY KEY (Flight_No, Date ))" ;
                              
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createCustomerTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Customer " +
                              "(CUST_ID varchar(9) NOT NULL, " +
                              "CUST_First_Name varchar(20) NULL, " +
                              "CUST_Middle_Intial char(1) NULL, " +
                              "CUST_Last_Name varchar(20) NULL, " +
                              "CUST_Str_Number varchar(10) NULL, " +
                              "CUST_Str_Name varchar(25) NULL, " +
                              "CUST_Postal_Code varchar(15) NULL, " +
                              "CUST_Phone_# varchar(11) NULL, " +
                              "PRIMARY KEY (CUST_ID))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createPmtMethodTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".PmtMethod " +
                              "(Card_# varchar(20) NOT NULL, " +
                              "Card_Type varchar(25) NOT NULL, " +
                              "CUST_ID varchar(9) NOT NULL FOREIGN KEY REFERENCES Customer (CUST_ID ), " +
                              "PRIMARY KEY (Card_#))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createReservationTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Reservation " +
                              "(Res_ID varchar(9) NOT NULL, " +
                              "Agent_First_Name varchar(20) NULL, " +
                              "Agent_Last_Name varchar(20) NULL, " +
                              "Card_# varchar(20) NOT NULL FOREIGN KEY REFERENCES PmtMethod (Card_# ), " +
                              "CUST_ID varchar(9) NOT NULL FOREIGN KEY REFERENCES Customer (CUST_ID ), " +
                              "PRIMARY KEY (Res_ID))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createFFMembershipTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".FFMembership " +
                              "(CUST_ID varchar(9) NOT NULL FOREIGN KEY REFERENCES Customer (CUST_ID ), " +
                              "Airline_Name varchar(25) NOT NULL FOREIGN KEY REFERENCES Airline (Airline_Name ), " +
                              "FF_Number varchar(25) NOT NULL, " +
                              "PRIMARY KEY (FF_Number))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createFlightLegTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".FlightLeg " +
                              "(Res_ID varchar(9), " +
                              "Flight_No varchar(6) NOT NULL, " +
                              "Date date NOT NULL, " +
                              "Res_Status varchar(10) NULL, " +
                              "PRIMARY KEY (Flight_No, Date), " +
                              "FOREIGN KEY (Flight_No, Date) REFERENCES Flight(Flight_No, Date))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createPreferencesTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "create table " + dbName +
                              ".Preferences " +
                              "(CUST_ID varchar(9) NOT NULL FOREIGN KEY REFERENCES Customer (CUST_ID ), " +
                              "Res_ID varchar(9) NOT NULL FOREIGN KEY REFERENCES Reservation (Res_ID ), " +
                              "Seating varchar(25) NULL, " +
                              "Diet varchar(25) NULL, " +
                              "PRIMARY KEY (CUST_ID))";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void dropAllTables() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "drop table " + dbName +
                              ".Preferences " + "drop table " + dbName +
                              ".Reservation " + "drop table " + dbName +
                              ".PmtMethod "+ "drop table " + dbName +
                              ".FlightLeg " + "drop table " + dbName +
                              ".Flight " + "drop table " + dbName +
                              ".Plane " + "drop table " + dbName +
                              ".FFMembership " + "drop table " + dbName +
                              ".Customer " + "drop table " + dbName +
                              ".Airport " + "drop table " + dbName +
                              ".Airline";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void dropAllViews() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "drop view " + dbName +
                              ".testView";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
}

