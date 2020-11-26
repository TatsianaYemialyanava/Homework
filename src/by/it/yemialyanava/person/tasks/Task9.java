package by.it.yemialyanava.person.tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int maxDaysInMonth = getMaxDaysInMonth(month, year);

        if ((day + 1 < maxDaysInMonth) || (day + 1 == maxDaysInMonth)) {
            day = day + 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day + 1 > maxDaysInMonth) {
            day = 1;
            month = month + 1;
            if (month + 1 > 12) {
                month = 1;
                year = year + 1;
                System.out.println(day + "." + month + "." + year);
            } else {
                System.out.println(day + "." + month + "." + year);
            }
        }
    }

    static int getMaxDaysInMonth(int month, int year) {
        int maxDays = 0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDays = 30;
                    break;
                case 2:
                    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                        maxDays = 29;
                        break;
                    } else {
                        maxDays = 28;
                        break;
                    }
                default:
                    System.out.println("Такого месяца не существует");
                    break;
            }
        return maxDays;
    }
}
