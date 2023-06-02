package com.class1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception{
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mlj_class2_food"
                    ,"root","");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
