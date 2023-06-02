package com.class1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class frDAO {
    public boolean addFr( Fr fr) throws  Exception {
        try {
            Connection connection = DBUtil.getConnection();
            CallableStatement callableStatement = (CallableStatement) connection.prepareStatement("{call fr(?,?,?)}");

            return ( callableStatement.executeUpdate() > 0);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
