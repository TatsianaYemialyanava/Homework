package by.it.yemialyanava.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        File firstFile = new File(currentDir);
        File necessaryDirectory = new File(firstFile,
                "by"+ File.separator + "it" + File.separator + "yemialyanava" + File.separator +
                        "IO" + File.separator);
        File textFile = new File (necessaryDirectory , "text48.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))) {
            String line = bufferedReader.readLine();
            int summa = 0;
            List<Integer> arrayOfNumbers = new ArrayList<>();
            while (line != null){
                System.out.println(line);
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    int number = Integer.parseInt(matcher.group());
                    arrayOfNumbers.add(number);
                    summa = summa + number;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(arrayOfNumbers.toString());

            System.out.println("\n Summa = " + summa);

            Set<Integer> setNumbers = new HashSet<>(arrayOfNumbers);
            System.out.println(setNumbers.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
