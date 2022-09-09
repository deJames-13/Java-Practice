package tuts.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("Lol");
            writer.close();
            FileReader reader = new FileReader("myfile.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
