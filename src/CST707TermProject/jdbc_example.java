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
  CreateTable tableCreator = new CreateTable();
  PopulateTable tablePopulator = new PopulateTable();
//  QueryGenerator queryGenerator = new QueryGenerator();
  
  tableCreator.createStudioTable();
  tableCreator.createEngineTable();
  tableCreator.createPublisherTable();
  tableCreator.createFranchiseTable();
  tableCreator.createGameTable();
  tableCreator.createPlatformTable();
  tableCreator.createEmployeeTable();
  tableCreator.createTitleTable();
  tableCreator.createReviewTable();
  tableCreator.createGame_has_PlatformTable();
  tableCreator.createGame_has_EmployeeTable();
  
  tablePopulator.populateSTUDIO();
  tablePopulator.populateENGINE();
  tablePopulator.populatePUBLISHER();
  tablePopulator.populateFRANCHISE();
  tablePopulator.populateGAME();
  tablePopulator.populatePLATFORM();
  tablePopulator.populateEMPLOYEE();
  tablePopulator.populateTITLE();
  tablePopulator.populateREVIEW();
  tablePopulator.populateGAMEPLATFORM();
  tablePopulator.populateGAMEEMPLOYEE();
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