package FILEHANDLING;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FILE_handling {
    public static void main(String[] args) {
//        try(InputStreamReader isr=new InputStreamReader(System.in)){
//            System.out.println("Enter some letter: ");
//            int letters=isr.read();
//            while(isr.ready()){
//                System.out.println((char)letters);
//                letters=isr.read();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        try (FileReader fr = new FileReader("notes.txt")) {
            System.out.println("Enter some letter: ");
            int letter=fr.read();
            while (fr.ready()) {
                System.out.println((char) letter);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
