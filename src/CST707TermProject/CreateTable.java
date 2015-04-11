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

    public String dbName = "`jjackson`"; 
    public String url = "jdbc:mysql://localhost:3306/jjackson?user=jjackson&password=Amricap1";
//    
    public static void CreateTable(){
        
    }
    
    public void createStudioTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Studio` (" +
                                "`idStudio` INT NOT NULL ," +
                                "`studioName` VARCHAR(45) NULL ," +
                                "`dateFounded` DATE NULL ," +
                                "`Founder` VARCHAR(45) NULL ," +
                                "`WebsiteURL` VARCHAR(45) NULL ," +
                                "`Emp Count` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idStudio`) ," +
                                "UNIQUE INDEX `idStudio_UNIQUE` (`idStudio` ASC) )" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }
  }
    
    public void createEngineTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Engine` (" +
                                "`idEngine` INT NOT NULL ," +
                                "`engineName` VARCHAR(45) NULL ," +
                                "`initialReleaseDate` DATE NULL ," +
                                "`isCommercial` TINYINT(1) NULL ," +
                                "`Maker` VARCHAR(45) NULL ," +
                                "`Language` VARCHAR(15) NULL ," +
                                "PRIMARY KEY (`idEngine`) ," +
                                "UNIQUE INDEX `idEngine_UNIQUE` (`idEngine` ASC) )" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createPublisherTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Publisher` (" +
                                "`idPublisher` INT NOT NULL ," +
                                "`publisherName` VARCHAR(45) NULL ," +
                                "`dateFounded` DATE NULL ," +
                                "`websiteURL` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idPublisher`) ," +
                                "UNIQUE INDEX `idPublisher_UNIQUE` (`idPublisher` ASC) )" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createFranchiseTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Franchise` (" +
                                "`idFranchise` INT NOT NULL ," +
                                "`franchiseName` VARCHAR(45) NULL ," +
                                "`GameCount` INT NULL ," +
                                "`Owner` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idFranchise`) ," +
                                "UNIQUE INDEX `idFranchise_UNIQUE` (`idFranchise` ASC) )" +
                              "ENGINE = InnoDB;";
                              
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createGameTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Game` (" +
                                "`idGame` INT NOT NULL ," +
                                "`gameName` VARCHAR(45) NULL ," +
                                "`Release Date` DATE NULL ," +
                                "`Genre` VARCHAR(45) NULL ," +
                                "`ParentalRating` VARCHAR(45) NULL ," +
                                "`Studio_idStudio` INT NOT NULL ," +
                                "`Engine_idEngine` INT NOT NULL ," +
                                "`Publisher_idPublisher` INT NOT NULL ," +
                                "`Franchise_idFranchise` INT NOT NULL ," +
                                "PRIMARY KEY (`idGame`) ," +
                                "UNIQUE INDEX `idGame_UNIQUE` (`idGame` ASC) ," +
                                "INDEX `fk_Game_Studio_idx` (`Studio_idStudio` ASC) ," +
                                "INDEX `fk_Game_Engine1_idx` (`Engine_idEngine` ASC) ," +
                                "INDEX `fk_Game_Publisher1_idx` (`Publisher_idPublisher` ASC) ," +
                                "INDEX `fk_Game_Franchise1_idx` (`Franchise_idFranchise` ASC) ," +
                                "CONSTRAINT `fk_Game_Studio`" +
                                  "FOREIGN KEY (`Studio_idStudio` )" +
                                  "REFERENCES "+ dbName +".`Studio` (`idStudio` )," +
                                "CONSTRAINT `fk_Game_Engine1`" +
                                  "FOREIGN KEY (`Engine_idEngine` )" +
                                  "REFERENCES "+ dbName +".`Engine` (`idEngine` )," +
                                "CONSTRAINT `fk_Game_Publisher1`" +
                                  "FOREIGN KEY (`Publisher_idPublisher` )" +
                                  "REFERENCES "+ dbName +".`Publisher` (`idPublisher` )," +
                                "CONSTRAINT `fk_Game_Franchise1`" +
                                  "FOREIGN KEY (`Franchise_idFranchise` )" +
                                  "REFERENCES "+ dbName +".`Franchise` (`idFranchise` ))" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createPlatformTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Platform` (" +
                                "`idPlatform` INT NOT NULL ," +
                                "`platformName` VARCHAR(45) NULL ," +
                                "`operatingSystem` VARCHAR(45) NULL ," +
                                "`Owner` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idPlatform`) ," +
                                "UNIQUE INDEX `idPlatform_UNIQUE` (`idPlatform` ASC) )" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createEmployeeTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Employee` (" +
                                "`idEmployee` INT NOT NULL ," +
                                "`firstName` VARCHAR(45) NULL ," +
                                "`lastName` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idEmployee`) ," +
                                "UNIQUE INDEX `idEmployee_UNIQUE` (`idEmployee` ASC) )" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createTitleTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Title` (" +
                                "`idTitle` INT NOT NULL ," +
                                "`titleName` VARCHAR(45) NULL ," +
                                "PRIMARY KEY (`idTitle`) ," +
                                "UNIQUE INDEX `idTitle_UNIQUE` (`idTitle` ASC) )" +
                              "ENGINE = InnoDB;";

        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createReviewTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Review` (" +
                                "`idReview` INT NOT NULL ," +
                                "`Rating` DECIMAL(4,3) NULL ," +
                                "`Subject` VARCHAR(45) NULL ," +
                                "`Content` LONGTEXT NULL ," +
                                "`URL` VARCHAR(45) NULL ," +
                                "`Game_idGame` INT NOT NULL ," +
                                "PRIMARY KEY (`idReview`) ," +
                                "UNIQUE INDEX `idReview_UNIQUE` (`idReview` ASC) ," +
                                "INDEX `fk_Review_Game1_idx` (`Game_idGame` ASC) ," +
                                "CONSTRAINT `fk_Review_Game1`" +
                                  "FOREIGN KEY (`Game_idGame` )" +
                                  "REFERENCES "+ dbName +".`Game` (`idGame` ))" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    public void createGame_has_PlatformTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Game_has_Platform` (" +
                                "`Game_idGame` INT NOT NULL ," +
                                "`Platform_idPlatform` INT NOT NULL ," +
                                "PRIMARY KEY (`Game_idGame`, `Platform_idPlatform`) ," +
                                "INDEX `fk_Game_has_Platform_Platform1_idx` (`Platform_idPlatform` ASC) ," +
                                "INDEX `fk_Game_has_Platform_Game1_idx` (`Game_idGame` ASC) ," +
                                "CONSTRAINT `fk_Game_has_Platform_Game1`" +
                                  "FOREIGN KEY (`Game_idGame` )" +
                                  "REFERENCES "+ dbName +".`Game` (`idGame` )," +
                                "CONSTRAINT `fk_Game_has_Platform_Platform1`" +
                                  "FOREIGN KEY (`Platform_idPlatform` )" +
                                  "REFERENCES "+ dbName +".`Platform` (`idPlatform` ))" +
                              "ENGINE = InnoDB;";
        java.sql.Statement stmt = null;
        
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(createString);
        }
    
    finally {
        if (stmt != null) { stmt.close(); }
    }

    }
    
    
    public void createGame_has_EmployeeTable() throws SQLException {
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "CREATE  TABLE IF NOT EXISTS "+ dbName +".`Game_has_Employee` (" +
                                "`Game_idGame` INT NOT NULL ," +
                                "`Employee_idEmployee` INT NOT NULL ," +
                                "`Title_idTitle` INT NOT NULL ," +
                                "`Studio_idStudio` INT NOT NULL ," +
                                "PRIMARY KEY (`Game_idGame`, `Employee_idEmployee`, `Title_idTitle`, `Studio_idStudio`) ," +
                                "INDEX `fk_Game_has_Employee_Employee1_idx` (`Employee_idEmployee` ASC) ," +
                                "INDEX `fk_Game_has_Employee_Game1_idx` (`Game_idGame` ASC) ," +
                                "INDEX `fk_Game_has_Employee_Title1_idx` (`Title_idTitle` ASC) ," +
                                "INDEX `fk_Game_has_Employee_Studio1_idx` (`Studio_idStudio` ASC) ," +
                                "CONSTRAINT `fk_Game_has_Employee_Game1`" +
                                  "FOREIGN KEY (`Game_idGame` )" +
                                  "REFERENCES "+ dbName +".`Game` (`idGame` )," +
                                "CONSTRAINT `fk_Game_has_Employee_Employee1`" +
                                  "FOREIGN KEY (`Employee_idEmployee` )" +
                                  "REFERENCES "+ dbName +".`Employee` (`idEmployee` )," +
                                "CONSTRAINT `fk_Game_has_Employee_Title1`" +
                                  "FOREIGN KEY (`Title_idTitle` )" +
                                  "REFERENCES "+ dbName +".`Title` (`idTitle` )," +
                                "CONSTRAINT `fk_Game_has_Employee_Studio1`" +
                                  "FOREIGN KEY (`Studio_idStudio` )" +
                                  "REFERENCES "+ dbName +".`Studio` (`idStudio` ))" +
                              "ENGINE = InnoDB;";
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
        
        
        Connection conn = DriverManager.getConnection (url);
        
        String createString = "drop table " + dbName +
                              ".Game_has_Employee " + "drop table " + dbName +
                              ".Game_has_Platform " + "drop table " + dbName +
                              ".Review "+ "drop table " + dbName +
                              ".Title " + "drop table " + dbName +
                              ".Employee " + "drop table " + dbName +
                              ".Platform " + "drop table " + dbName +
                              ".Game " + "drop table " + dbName +
                              ".Franchise " + "drop table " + dbName +
                              ".Publisher " + "drop table " + dbName +
                              ".Engine " + "drop table " + dbName +
                              ".Studio " ;
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
        
        
        Connection conn = DriverManager.getConnection (url);
        
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

