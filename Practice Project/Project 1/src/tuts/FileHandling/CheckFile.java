package tuts.FileHandling;

import java.io.File;

public class CheckFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        // file.delete()

    }
}
