package jm.task.core.jdbc.util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/usersDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Mamku228";
    private  Connection connection;
    public Util() {
        this.connection = getConnection();
    }

    public Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()) {
                try {
                    connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
