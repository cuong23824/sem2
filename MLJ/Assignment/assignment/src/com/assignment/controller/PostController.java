package com.assignment.controller;

import com.assignment.Post;
import com.assignment.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    public void checkID(Post post){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connection = DBUtil.getMySQLConnection();
            preparedStatement = connection.prepareStatement("select userId from posts where userId like  ?");
            preparedStatement.setString(1, String.valueOf(post));
            rs = preparedStatement.executeQuery();
            if(rs.isBeforeFirst()){
                throw new Exception("id..");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
                preparedStatement.close();
                rs.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}

