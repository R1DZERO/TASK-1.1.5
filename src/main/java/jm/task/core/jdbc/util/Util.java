package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
   private static final String URL = "jdbc:mysql://localhost:3306/usersDB";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "Mamku228";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
