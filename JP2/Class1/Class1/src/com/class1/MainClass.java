package com.class1;

import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        FileManagement file = new FileManagement();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to find: ");
        String word = input.nextLine();

        File directory = new File("F:\\Sem_2\\Sem_2\\JP2\\Class1\\Class1");

        try {
            file.getFile(directory, word);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
