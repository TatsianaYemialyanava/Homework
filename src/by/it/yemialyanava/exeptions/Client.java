package by.it.yemialyanava.exeptions;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        String note = "i yua devushek lublu";
        String[] noteArray = note.split(" ");
        try {
            Buttle.main(noteArray);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
