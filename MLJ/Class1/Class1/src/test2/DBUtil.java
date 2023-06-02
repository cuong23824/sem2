package test2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_create_food"
                    ,"root","");

            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

