package com.assignment;

import com.assignment.controller.PostController;
import com.assignment.util.DBUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JSONManagement {
    public void readJSON() throws Exception {
        PostController postController = new PostController();

        try {
            String apiURL = "https://jsonplaceholder.typicode.com/posts";
            URL url = new URL(apiURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();


            org.json.JSONArray jsonArray = new org.json.JSONArray(response.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                org.json.JSONObject post
                        = (org.json.JSONObject) jsonArray.get(i);


                Post newPost = new Post(
                        Integer.parseInt(post.get("id").toString()),
                        Integer.parseInt(post.get("userId").toString()),
                        post.get("title").toString(),
                        post.get("body").toString()
                );
                postController.insertNewPost(newPost);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void delete() throws Exception {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBUtil.getMySQLConnection();
            statement = connection.createStatement();
            statement.executeUpdate("delete from posts ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}