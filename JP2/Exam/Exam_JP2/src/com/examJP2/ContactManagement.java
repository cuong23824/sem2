package com.examJP2;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactManagement {
    private String findContact;

    public void addNewContact() throws Exception{
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Exam_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Contact_ExamJP2(contactName, company, email, phoneNumber) values (?,?,?,?)");
            Scanner inputData = new Scanner(System.in);


            System.out.print("Enter Contact Name: ");
            String name = inputData.nextLine();
            //

            System.out.print("Enter Company: ");
            String company = inputData.nextLine();
            //

            System.out.print("Enter Email: ");
            String email = inputData.nextLine();
            Matcher matcher = pattern.matcher(email);
            if(!matcher.matches()) {
                throw new Exception("Erro mail fomat");
            }

            System.out.print("Enter Phone Number: ");
            String phoneNumber = inputData.nextLine();
            //

            Contact contact = new Contact(name, company, email, phoneNumber);
            preparedStatement.setString(1, contact.getName());
            preparedStatement.setString(2, contact.getCompany());
            preparedStatement.setString(3, contact.getEmail());
            preparedStatement.setString(4, contact.getPhoneNumber());

            int updated = preparedStatement.executeUpdate();
            if (updated > 0) {
                System.out.println("Insert Contact success!");
            }
            preparedStatement.close();
            connection.close();

        }catch  (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public void displayContact() throws Exception{
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Exam_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT contactName, company, email, phoneNumber FROM Contact_ExamJP2");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                System.out.println("-----Contact-----");
                Contact contact = new Contact(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                System.out.println(contact.toString());
            }
            rs.close();
            preparedStatement.close();
            connection.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void findContact()throws Exception{
        try {
            Scanner inputData = new Scanner(System.in);
            System.out.print("Enter Contact to find: ");
            this.findContact = inputData.nextLine();
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VMGQI7CN\\SQLEXPRESS05;instance=SQLEXPRESS;database=Exam_JP2;encrypt=true;trustServerCertificate=true","cuong","23082004Ncc");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT contactName, phoneNumber FROM Contact_ExamJP2 where contactName like ?");
            preparedStatement.setString(1,findContact);
            ResultSet rs = preparedStatement.executeQuery();
            if (!rs.isBeforeFirst()) {
                System.out.println("Not found");
                return;

            }
            while (rs.next()){
                System.out.println("-----Find-----");
                Contact contact = new Contact(
                        rs.getString(1),
                        rs.getString(2)
                );
                System.out.println(contact.toString());
            }
            rs.close();
            preparedStatement.close();
            connection.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
