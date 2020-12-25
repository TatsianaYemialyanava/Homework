package by.it.yemialyanava.IO;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task47 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File firstFile = new File(currentDir);
        System.out.println(firstFile.getAbsolutePath());
        File necessaryDirectory = new File(firstFile,
                "by"+ File.separator + "it" + File.separator + "yemialyanava" + File.separator +
                "IO" + File.separator);
        System.out.println(necessaryDirectory.getAbsolutePath());
        File textFile = new File (necessaryDirectory , "text47.txt");
        System.out.println(textFile);

        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader(textFile))) {
            int words = 0;
            int sights = 0;
            String line = bufferedReader.readLine();
            while (line != null){
                Pattern pattern = Pattern.compile("[A-Za-zА-Яа-яЁё]+");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    words++;
                }
                Pattern patternSights = Pattern.compile("[-.,!\\(\\)\\?:;\"]");
                Matcher matcherSights = patternSights.matcher(line);
                while (matcherSights.find()){
                    sights++;
                }
                line = bufferedReader.readLine();
            }
            System.out.println("This text have " + words + " and " + sights + " punctuation marks.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
