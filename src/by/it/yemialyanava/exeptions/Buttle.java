package by.it.yemialyanava.exeptions;

import java.util.Scanner;

public class Buttle {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line == null || !line.matches("[0-9]")){
             throw new MyException("Формат винных бутылок указан неверно");
        }
    }
}
