package by.it.yemialyanava.person.tasks;

public class Task14 {
    public static void main(String[] args) {
        long i = 7893823445L;
        int summa = 0;
        do {
            summa = (int) (summa + (i % 10));
            i = i / 10;
        } while (i != 0);
        System.out.println("Сумма цифр числа равна " + summa);
    }
}
