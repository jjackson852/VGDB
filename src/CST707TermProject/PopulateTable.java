/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CST707TermProject;

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
    
    
    
    public void populateSTUDIO() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Studio` (`studioName`, `dateFounded`, `Founder`, `WebsiteURL`, `Emp Count`) VALUES ('Treyarch', '06-05-2002', 'Simon Sam', 'treyarch.com', '400');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Studio` (`studioName`, `dateFounded`, `Founder`, `WebsiteURL`, `Emp Count`) VALUES ('Sledgehammer Games', '25-07-2010', 'Phillip Sledge', 'sledgehammer.com', '300');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Studio` (`studioName`, `dateFounded`, `Founder`, `WebsiteURL`, `Emp Count`) VALUES ('DICE', '20-09-2001', 'Robert Hammilton', 'dice.com', '700');");        
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Studio` (`studioName`, `dateFounded`, `Founder`, `WebsiteURL`, `Emp Count`) VALUES ('343 Industries', '13-03-2011', 'Crystal Renee', '343i.com', '450');");
        }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }
    
    
    
    public void populateENGINE() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Engine` (`engineName`, `initialReleaseDate`, `isCommercial`, `Maker`, `Language`) VALUES ('Unreal Engine', '15-12-1997', '1', 'Epic Games', 'C++');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Engine` (`engineName`, `initialReleaseDate`, `isCommercial`, `Maker`, `Language`) VALUES ('Unity', '03-05-2003', '1', 'Unity Technologies', 'C#');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Engine` (`engineName`, `initialReleaseDate`, `isCommercial`, `Maker`, `Language`) VALUES ('FrostBite', '24-06-2006', '0', 'DICE', 'C++');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Engine` (`engineName`, `initialReleaseDate`, `isCommercial`, `Maker`, `Language`) VALUES ('IW Engine', '10-12-2006', '0', 'Activision', 'C++');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }    
    
    
    
    public void populatePUBLISHER() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Publisher` (`publisherName`, `dateFounded`, `websiteURL`) VALUES ('Electronic Arts', '04-05-1992', 'ea.com');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Publisher` (`publisherName`, `dateFounded`, `websiteURL`) VALUES ('Activision', '07-07-1997', 'activision.com');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Publisher` (`publisherName`, `dateFounded`, `websiteURL`) VALUES ('Ubisoft', '09-17-2000', 'ubisoft.com');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Publisher` (`publisherName`, `dateFounded`, `websiteURL`) VALUES ('Microsoft Studios', '20-10-2001', 'microsoft.com');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }

    
    
    public void populateFRANCHISE() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Franchise` (`franchiseName`, `GameCount`, `Owner`) VALUES ('Halo', '8', 'Microsoft');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Franchise` (`franchiseName`, `GameCount`, `Owner`) VALUES ('Battlefield', '15', 'Electronic Arts');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Franchise` (`franchiseName`, `GameCount`, `Owner`) VALUES ('Call of Duty', '12', 'Activision');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    }  



public void populateGAME() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game` (`gameName`, `Release Date`, `Genre`, `ParentalRating`, `Studio_idStudio`, `Engine_idEngine`, `Publisher_idPublisher`, `Franchise_idFranchise`) VALUES ('Battlefield 4', '24-11-2012', 'Military Shooter', 'M', '3', '3', '1', '2');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game` (`gameName`, `Release Date`, `Genre`, `ParentalRating`, `Studio_idStudio`, `Engine_idEngine`, `Publisher_idPublisher`, `Franchise_idFranchise`) VALUES ('Halo 5', '10-11-2015', 'Sc-Fi Shooter', 'M', '4', '1', '4', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game` (`gameName`, `Release Date`, `Genre`, `ParentalRating`, `Studio_idStudio`, `Engine_idEngine`, `Publisher_idPublisher`, `Franchise_idFranchise`) VALUES ('Call of Duty: Black Ops', '23-11-2011', 'Military Shooter', 'M', '1', '4', '2', '3');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 



public void populatePLATFORM() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Xbox One', 'Xbox One OS', 'Microsoft');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Playstation 4', 'PS4 OS', 'Sony');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Xbox 360 ', 'Xbox 360 OS', 'Microsoft');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Playstation 3', 'PS3 OS', 'Sony');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Wii U', 'Wii U OS', 'Nintendo');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Steam - Windows', 'Windows', 'Valve');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Steam - OS X', 'OS X', 'Valve');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Platform` (`platformName`, `operatingSystem`, `Owner`) VALUES ('Steam - Linux', 'Linux', 'Valve');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 



public void populateEMPLOYEE() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Employee` (`firstName`, `lastName`) VALUES ('Rustin', 'Holbert');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Employee` (`firstName`, `lastName`) VALUES ('James', 'Jackson');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Employee` (`firstName`, `lastName`) VALUES ('Ryan', 'Hammontree');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 



public void populateTITLE() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Title` (`titleName`) VALUES ('Art Director');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Title` (`titleName`) VALUES ('Lead Programmer');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Title` (`titleName`) VALUES ('Lead UI');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Title` (`titleName`) VALUES ('Gameplay Tester');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 



public void populateREVIEW() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Review` (`Rating`, `Subject`, `Content`, `URL`, `Game_idGame`) VALUES ('.75', 'BATTLEFIELD 4 REVIEW: BULLET DROP', 'Developer DICE is moving the series towards bigger, well, battlefields — more vehicles, more emergent spectacle, more teamwork. And DICE seems determined to keep everything that has defined the series over the last three years and four game releases. It sounds like a great idea, and in execution Battlefield 4 is as successful as ever at the emergent, bombastic play that\\'s defined the series. But there are baggage-related bumps along the way.', 'polygon.com/2013/10/29/5040656/battlefield-4-review', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Review` (`Rating`, `Subject`, `Content`, `URL`, `Game_idGame`) VALUES ('.85', '64 STYLES OF DANGER.', 'Battlefield 4 is a greatest hits album of DICE’s multiplayer first-person shooter legacy. It retains the defining DNA of Battlefield 1942, re-adopts Battlefield 2’s brilliant Commander mode, and exaggerates the destruction of Battlefield: Bad Company 2, all while embracing the realism, class reorganization, and gorgeous graphics of Battlefield 3. Most of the time, Battlefield’s unpredictable, vehicular-based competitive combat is predictably excellent. What I didn’t anticipate was DICE getting in its own way.', 'ign.com/articles/2013/11/26/battlefield-4-xbox-one-review', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Review` (`Rating`, `Subject`, `Content`, `URL`, `Game_idGame`) VALUES ('.80', 'COD: Black Ops Review', 'Although Call of Duty: Black Ops may have a lot familiar to fans of the series, Treyarch has pushed a lot of the right buttons and has made the best Call of Duty game to date.', 'www.darkstation.com/reviews/xbox-360/call-of-duty-black-ops/', '3');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 




public void populateGAMEPLATFORM() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('2', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('1', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('1', '2');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('1', '3');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('1', '4');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('1', '6');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('3', '3');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('3', '4');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Platform` (`Game_idGame`, `Platform_idPlatform`) VALUES ('3', '6');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 





public void populateGAMEEMPLOYEE() throws SQLException{
        Connection conn = DriverManager.getConnection (url);
        Statement stmt = null;
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Employee` (`Game_idGame`, `Employee_idEmployee`, `Title_idTitle`, `Studio_idStudio`) VALUES ('3', '1', '4', '1');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Employee` (`Game_idGame`, `Employee_idEmployee`, `Title_idTitle`, `Studio_idStudio`) VALUES ('2', '3', '3', '4');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Employee` (`Game_idGame`, `Employee_idEmployee`, `Title_idTitle`, `Studio_idStudio`) VALUES ('2', '2', '3', '4');");
        stmt.executeUpdate(
                "INSERT INTO `jjackson`.`Game_has_Employee` (`Game_idGame`, `Employee_idEmployee`, `Title_idTitle`, `Studio_idStudio`) VALUES ('1', '1', '1', '3');");
                }  
    
    finally {
        if (stmt != null) { stmt.close(); }
        }
    } 




}