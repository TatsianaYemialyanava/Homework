package by.it.yemialyanava.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesAndDirectories {

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File firstFile = new File(currentDir);
        System.out.println(firstFile.getAbsolutePath());
        File necessaryFile = new File(firstFile, "by/it/yemialyanava");

        File[] arrayOfFiles = necessaryFile.listFiles();
        List<String> arrayOfOnlyFiles = new ArrayList<>();
        List<String> arrayOfDirectory = new ArrayList<>();

        for (int i = 0; i < arrayOfFiles.length; i++) {
            if(arrayOfFiles[i].isFile()){
                arrayOfOnlyFiles.add(arrayOfFiles[i].getName());
            } if (arrayOfFiles[i].isDirectory()){
                arrayOfDirectory.add(arrayOfFiles[i].getName());
            }
        }

        System.out.println("Files: ");
        for (String e: arrayOfOnlyFiles) {
            System.out.println(e);
        }

        System.out.println("\n Directory is: ");
        for (String e: arrayOfDirectory) {
            System.out.println(e);
        }
    }
}
