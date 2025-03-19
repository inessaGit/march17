package com.startsteps.files;

import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {

    }
    public void createFile(){

    }
    public static void readFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("This is a line of text.");
            writer.newLine(); // Writes a newline character
            writer.write("Another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

