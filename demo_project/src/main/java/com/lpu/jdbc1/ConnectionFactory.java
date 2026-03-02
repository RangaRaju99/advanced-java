package com.lpu.jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // STEP 1 → Create static reference
    private static Connection conn = null;

    // STEP 2 → Private constructor (prevents object creation)
    private ConnectionFactory() {}

    // STEP 3 → Public method to provide connection
    public static Connection getConnection() {

        try {

            // Recreate connection if it is null OR closed
            if (conn == null || conn.isClosed()) {

                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/lpu",
                        "root",
                        "Root"
                );

                System.out.println("✅ New Connection Created");
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
