package by.it.yemialyanava.person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serial {
    public static void main(String[] args) throws IOException {
        List<PersonSerializ> personsSer = new ArrayList<>();
        PersonSerializ personSer1 = new PersonSerializ();
        PersonSerializ personSer2 = new PersonSerializ();
        personSer1.setName("Igor");
        personSer2.setName("Vaga");
        personSer1.setLastName("Krepko");
        personSer2.setLastName("Jvitiashvili");
        personSer1.setBirthday("15.06.12");
        personSer2.setBirthday("13.10.11");
        personSer1.setRace("Whity");
        personSer1.setRace("Black");
        personsSer.add(personSer1);
        personsSer.add(personSer2);
        FileOutputStream fileForOutput = new FileOutputStream("D://serialfile.out");

        ObjectOutputStream oos = new ObjectOutputStream(fileForOutput);
        oos.writeObject(personsSer);
        oos.flush();
        oos.close();
    }
}
