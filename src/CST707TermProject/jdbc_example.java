package CST707TermProject;

import java.sql.*;
//import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class jdbc_example
{
 public static void main(String[] args) throws SQLException 
  {

  try 
   {
    // Change the below string if you use a DBMS other than MS SQL Server 2008 
    Class.forName ("com.mysql.jdbc.Driver");
		
    Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/jjackson?user=jjackson&password=Amricap1");

    Statement stmt = conn.createStatement ( );
    DatabaseMetaData meta = conn.getMetaData ( );
 
    if (conn != null) 
     {
      System.out.println ( "Successfully connected" );
   
    }
   } 
  catch ( Exception e ) 
   { 
    System.out.println ( "ERROR: " + e.getMessage ( ) ); 
   }
//  CreateTable tableCreator = new CreateTable();
//  PopulateTable tablePopulator = new PopulateTable();
//  QueryGenerator queryGenerator = new QueryGenerator();
//  
//  tableCreator.createAirportTable();
//  tableCreator.createAirlineTable();
//  tableCreator.createPlaneTable();
//  tableCreator.createFlightTable();
//  tableCreator.createCustomerTable();
//  tableCreator.createPmtMethodTable();
//  tableCreator.createReservationTable();
//  tableCreator.createFFMembershipTable();
//  tableCreator.createFlightLegTable();
//  tableCreator.createPreferencesTable();
//  
//  tablePopulator.populateAirportTable();
//  tablePopulator.populateAirlineTable();
//  tablePopulator.populatePlaneTable();
//  tablePopulator.populateFlightTable();
//  tablePopulator.populateCustomerTable();
//  tablePopulator.populatePmtMethodTable();
//  tablePopulator.populateReservationTable();
//  tablePopulator.populateFFMembershipTable();
//  tablePopulator.populateFlightLegTable();
//  tablePopulator.populatePreferencesTable();
//  
//  
//  queryGenerator.queryNumber1();
//  queryGenerator.queryNumber2();
//  queryGenerator.queryNumber3();
//  queryGenerator.queryNumber4();
//  queryGenerator.queryNumber5();
//  queryGenerator.queryNumber6();
//  
//  
//  tableCreator.dropAllTables();
  }
}