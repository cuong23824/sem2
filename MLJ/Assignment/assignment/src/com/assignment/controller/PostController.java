package com.assignment.controller;

import com.assignment.Post;
import com.assignment.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostController {
    String INSERT_POST = "INSERT INTO posts VALUES(?,?,?,?)";


    public boolean insertNewPost(Post post) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtil.getMySQLConnection();
            preparedStatement
                    = connection.prepareStatement(INSERT_POST);

            preparedStatement.setInt(1, post.getId());
            preparedStatement.setInt(2, post.getUserId());
            preparedStatement.setString(3, post.getTitle());
            preparedStatement.setString(4, post.getBody());


            return (preparedStatement.executeUpdate() > 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            return false;
        }
    }
}

