package com.assignment.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getMySQLConnection() throws Exception {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment_mlj", "root", "");
            return connection;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
