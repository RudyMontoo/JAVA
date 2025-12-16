package ESEOOPS.Problem9;

import java.io.*;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        String text = "Hello, this text is written using try-with-resources";

        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
            System.out.println("Data written to file successfully");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
}}
