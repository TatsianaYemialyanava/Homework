package by.it.yemialyanava.person.tasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Диапазон #1. Введите количество часов");
        int hour = scanner.nextInt();
        System.out.println("Диапазон #1. Введите количество минут");
        int min = scanner.nextInt();
        System.out.println("Диапазон #1.Введите количество секунд");
        long sec = scanner.nextInt();
        System.out.println("Диапазон #2.Введите количество секунд");
        long seconds = scanner.nextInt();

        Range range1 = new Range(hour, min, sec);
        Range range2 = new Range(seconds);

        System.out.println("Первый по сравнению со вторым: " + comparisonWithWords(range1.compareSeconds(range2)));
    }

    private static String comparisonWithWords(int compareSeconds) {
        if (compareSeconds == -1){
            return "меньше";
        } else if (compareSeconds == 0){
            return "равен";
        } else {
            return "больше";
        }
    }

}
