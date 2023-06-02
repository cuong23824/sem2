package com.class3;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

public class JSONManagement {

    public void readJSONFromAPI() throws Exception {
        try {
            String apiUrl = "http://localhost:3001/products";
            URL url = new URL(apiUrl);

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

            System.out.println(response.toString());

            org.json.JSONArray jsonArray = new org.json.JSONArray(response.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                org.json.JSONObject product
                        = (org.json.JSONObject) jsonArray.get(i);
                int id = Integer.parseInt(product.get("id").toString());
                String title = product.get("title").toString();
                String imageurl = product.get("imageurl").toString();
                String category = product.get("category").toString();
                float price =  Float.parseFloat(product.get("price").toString());

                System.out.println(id+","+ title +","+imageurl+
                        " , "+category+" , "+price);
            }

            conn.disconnect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readJSONsample() throws Exception {
        try {
            JsonParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader("sample.json"));

            JSONPObject jsonObject = (JSONObject) obj;
            Person person = new Person();

            String firstName = jsonObject.get("firstName").toString();
            String lastName = jsonObject.get("lastName").toString();
            int age = Integer.parseInt(jsonObject.get("age").toString());

            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setAge(age);

            Map mapAddress = (Map) jsonObject.get("address");
            String streetAddress = mapAddress.get("streetAddress").toString();
            String city = mapAddress.get("city").toString();
            String state = mapAddress.get("state").toString();
            String postalCode = mapAddress.get("postalCode").toString();

            System.out.println(streetAddress);
            System.out.println(city);
            System.out.println(state);
            System.out.println(postalCode);

            JSONArray phoneNumbers = (JSONArray) jsonObject.get("phoneNumbers");
            Iterator phones = phoneNumbers.iterator();
            while(phones.hasNext()) {
                Iterator<Map.Entry> phone
                        = ((Map) phones.next()).entrySet().iterator();

                while(phone.hasNext()) {
                    Map.Entry pair = phone.next();
                    System.out.println(pair.getKey()+":"+pair.getValue());
                }
            }



        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public void readJSON() throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("student.json");
            Student[] students = objectMapper.readValue(file, Student[].class);

            if(students != null) {
                for (Student student : students) {
                    System.out.println(student.toString());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
}

