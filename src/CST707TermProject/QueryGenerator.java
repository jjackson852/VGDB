
package CST707TermProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jjackso3
 */
public class QueryGenerator extends jdbc_example {

    private String dbName = "jjackson"; 
    private String url = "jdbc:mysql://sun.cs.lsus.edu;databaseName=Database Engine;DatabaseName=team4; user=team4;password=team4";
    
    public static void QueryGenerator(){
        
    }
    
    public void queryNumber1() throws SQLException{
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "select Flight_No, Dept_AP_Intl_Code, Arr_AP_Intl_Code " +
                              "from " + dbName + ".Flight";
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(createString);
         System.out.println("\n\n\t\tQuery#1");
         System.out.println("----------------------------------------------------------");
         System.out.println("FlghtNo.\tDept. Airport\tArr. Airport");
         System.out.println("----------------------------------------------------------");
        while (rs.next()) {
            String flightNumber = rs.getString("Flight_No");
            String deptAirport = rs.getString("Dept_AP_Intl_Code");
            String arrAirport = rs.getString("Arr_AP_Intl_Code");
            System.out.println(flightNumber + "\t\t" + deptAirport +
                               "\t\t" + arrAirport);
            }
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }
    
    public void queryNumber2() throws SQLException{
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        String createString = "select Flight_No, Dept_Time, Arr_Time"
                + " FROM " + dbName + ".Flight"
                + " WHERE Dept_AP_Intl_Code = 'DFW'"
                + " AND Arr_AP_Intl_Code = 'LAX'"
                + " AND Date = '2006/12/31'";
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(createString);
         System.out.println("**********************************************************");
         System.out.println("**********************************************************");
         System.out.println("\n\n\t\tQuery#2");
         System.out.println("----------------------------------------------------------");
         System.out.println("FlghtNo.\tDept. Time\t\tArr. Time");
         System.out.println("----------------------------------------------------------");
        while (rs.next()) {
            String flightNumber = rs.getString("Flight_No");
            String deptTime = rs.getString("Dept_Time");
            String arrTime = rs.getString("Arr_Time");
            System.out.println(flightNumber + "\t\t" + deptTime +
                               "\t" + arrTime);
            }
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }

    
    public void queryNumber3() throws SQLException{
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        int count = 0;
        
        String createString = "select COUNT(Airline.Airline_Name), Airline.Airline_Name"
                + " FROM Airline FULL OUTER JOIN Flight ON Airline.Airline_Name = Flight.Airline_Name"
                + " WHERE Dept_AP_Intl_Code = 'DFW' AND Date = '2006/12/31'"
                + " GROUP BY Airline.Airline_Name";
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(createString);
         System.out.println("**********************************************************");
         System.out.println("**********************************************************");
         System.out.println("\n\n\t\tQuery#3");
         System.out.println("----------------------------------------------------------");
         System.out.println("Airline Name\t\tNumber of Flights");
         System.out.println("----------------------------------------------------------");
        while (rs.next()) {
            count = rs.getInt(1);
            String airlineName = rs.getString("Airline_Name");
            
           
            System.out.println(airlineName + "\t\t" + count);
            }
        
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }
    
    public void queryNumber4() throws SQLException{
        int count = 0;
        int count2 = 0;
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );


        
        String createString = "SELECT DISTINCT COUNT(*), AVG(Econ_Class_Price), Airport_Name, Airline.Airline_Name"
                + " FROM Airline inner JOIN Flight ON Flight.Airline_Name = Airline.Airline_Name inner JOIN Airport ON Flight.Dept_AP_Intl_Code = Airport.AP_Intl_Code"
                + " GROUP BY Airport_Name, Airline.Airline_Name";
               
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(createString);
        
        //String arr[] = new String[9];
         System.out.println("**********************************************************");
         System.out.println("**********************************************************");
         System.out.println("\n\n\t\tQuery#4");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("Airport Name\t\t\t\tAirline Name\t\t# of Flights\tAVG Econ Price");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      //  for(int i = 0; rs.next(); i++){
            
       //     arr[i] = rs.getString("Airport_Name");
      //  }
      //  rs = stmt.executeQuery(createString);
        while (rs.next()) {
            
            count = rs.getInt(1);
            count2 = rs.getInt(2);
            String airlineName = rs.getString("Airline_Name");
            //String airportName = rs.getString("Airport.Airport_Name");
            String airportName = rs.getString("Airport_Name");
           
            
            
            
            System.out.println(".................................................................................................");
            
            System.out.println(airportName + "\t" + airlineName +"\t\t" + count +"\t" + count2);
        
           
           /* while (rs.next()) {
            
            //count = rs.getInt(1);
            
            }*/
            //System.out.println("\t\t" + count);
            System.out.println(".................................................................................................");
            }
        
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }
    
     
    
    public void queryNumber5() throws SQLException{
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        
        String createString = "select Flight_No"
                + " FROM Flight"
                + " WHERE Dept_AP_Intl_Code = 'DFW'"
                + " AND Arr_AP_Intl_Code = 'LAX'"
                + " AND Seats_Avail > 0"
                + " AND Econ_Class_Price < 500.00";
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(createString);
         System.out.println("**********************************************************");
         System.out.println("**********************************************************");
         System.out.println("\n\n\t\tQuery#5");
         System.out.println("----------------------------------------------------------");
         System.out.println("Flight Number");
         System.out.println("----------------------------------------------------------");
        while (rs.next()) {
            String FlightNo = rs.getString("Flight_No");
            
           
            System.out.println(FlightNo);
            }
        
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }
    
     public void queryNumber6() throws SQLException{
        
        Connection conn = DriverManager.getConnection ( url, "team4", "team4" );
        
        int count = 0;
        
        String createString = "select Flight_No, Seats_Avail"
                + " FROM Flight"
                + " WHERE Dept_AP_Intl_Code = 'DFW'"
                + " AND Arr_AP_Intl_Code = 'LAX'"
                + " AND Seats_Avail > 0";
                             
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(createString);
         System.out.println("**********************************************************");
         System.out.println("**********************************************************");
         System.out.println("\n\n\t\tQuery#6");
         System.out.println("----------------------------------------------------------");
         System.out.println("Flight Number\tAvailable Seats");
         System.out.println("----------------------------------------------------------");
        while (rs.next()) {
            String FlightNo = rs.getString("Flight_No");
            String availSeats = rs.getString("Seats_Avail");
           
            System.out.println(FlightNo + "\t\t" + availSeats);
            }
        
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
    }
}
    

