package by.it.yemialyanava.person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserel {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("D://serialfile.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        List<PersonSerializ> ps = (List<PersonSerializ>) oin.readObject();
        oin.close();
        fis.close();
        printPersons(ps);
    }
    private static void printPersons(List<PersonSerializ> persons) {
            for (PersonSerializ element : persons) {
                System.out.println(element.getName() + "\n " + element.getLastName() + "\n");
       }
    }
}
