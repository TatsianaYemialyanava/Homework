package by.it.yemialyanava.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task49 {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        File fileFirst = new File(currentDirectory);
        System.out.println(fileFirst.getAbsolutePath());
        File currentFile = new File(fileFirst, "by/it/yemialyanava/IO/");
        File textFile = new File(currentFile, "textNumbers.txt");
        
        try(FileWriter fileWriter = new FileWriter(textFile)) {
            List<Integer> arrayOfNumbers = new ArrayList<>();
            for (int i = 0; i < 20 ; i++) {
                int number = (int) (Math.random()*100+1);
                fileWriter.write(number);
                arrayOfNumbers.add(number);
            }
            System.out.println(arrayOfNumbers.toString());
            //fileOutputStream.write(Integer.parseInt(str));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int summa = 0;
        int count = 0;
        try (FileReader fileReader = new FileReader(textFile)) {
             int numberFromFile = fileReader.read();
             while (numberFromFile != -1){
                 System.out.print(numberFromFile + " ");
                 summa = summa + numberFromFile;
                 count++;
                 numberFromFile = fileReader.read();
             }
            double avg = summa / count;
            System.out.println("\n summa = " + summa);
            System.out.println("count = " + count);
            System.out.println("average = " + avg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
