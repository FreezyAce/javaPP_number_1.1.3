package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static String USER_NAME = "root";
    private static String PASSWORD = "ROOT";
    private static String URL = "jdbc:mysql://localhost:3306/mysql";

    public static Statement statement;
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
