package by.it.yemialyanava;

import java.util.Scanner;

public class RunnerEnum {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("The next season is " + Seasons.getNextSeason(input));
        System.out.println("Season " + input + " have " + Seasons.getDaysInSeason(input) + " days.");
    }
}
