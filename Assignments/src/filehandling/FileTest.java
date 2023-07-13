package filehandling;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("LearnJava.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.getAbsolutePath());

//        String ha = "\\Mayank Paliwal\\";
//        System.out.println(ha);
//        String hello = "#\\Mayank";
//        System.out.println(hello);
//        System.out.println("\\Mayank\\");

    }
}
