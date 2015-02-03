package SQLUtil;


import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// This class sets up the database
public class DbConnection {

//127.10.124.2
    private static String dbURL = "jdbc:mysql://localhost:3306/";
    private static String schemaName = "Books1";
    private static String dbUsername = "root";
    private static String dbPassword = "";
//     private static String dbURL = "jdbc:mysql://127.10.124.2:3306/";
//    private static String schemaName = "Books";
//    private static String dbUsername = "adminWEiLqIj";
//    private static String dbPassword = "GM9ax9al-JGJ";
    private static Connection connection; 
    public DbConnection() {
        try {
            // load the DB driver
            Class.forName("com.mysql.jdbc.Driver");
            // get a DB connection
            connection = DriverManager.getConnection(dbURL + schemaName, dbUsername, dbPassword);
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR: Driver not found");
            connection = null;

        } catch (SQLException ex) {
            System.out.println("ERROR: Could not create DB connection");
        }

    }

    public static Statement getNewStatement() {
        Statement statement;
        try {
            if (connection == null) {
                new DbConnection();
            }
            /* Creating a statement object that we can use for running
             * SQL statements commands against the database.*/
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println("ERROR: Could not create SQL statement object: " + e);
            statement = null;
        }
        return statement;
    }

    public static Connection getConnection() {
        if (connection == null) {
            new DbConnection();
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}