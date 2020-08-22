package util;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterReader {

    public static void writeIntoFile(String fileName, String value) throws IOException {
        FileWriter nFile = new FileWriter(fileName + ".txt", false);
        nFile.append(value);
        nFile.close();
    }

    public static String readFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName + ".txt");
        Scanner scan = new Scanner(fr);
        String value = scan.nextLine();
        fr.close();
        return value;
    }
}
