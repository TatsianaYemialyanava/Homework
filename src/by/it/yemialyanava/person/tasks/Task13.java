package by.it.yemialyanava.person.tasks;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        int x = 1;
        BigInteger proisvedenie = new BigInteger("1");
        do{
            proisvedenie = proisvedenie.multiply(BigInteger.valueOf(x));
            x++;
        }while (x<=25);
        System.out.println("Произведение чисел от 1 до 25 равно " + proisvedenie);
    }
}
