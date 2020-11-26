package by.it.yemialyanava.person.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Понедельник");
                System.out.println("Изо, математика, чтение");
                break;
            case 2:
                System.out.println("Вторник");
                System.out.println("Русская литература, математика, письмо");
                break;
            case 3:
                System.out.println("Среда");
                System.out.println("Математика, чтение, физкультура");
                break;
            case 4:
                System.out.println("Четверг");
                System.out.println("Изо, математика, танцы");
                break;
            case 5:
                System.out.println("Пятница");
                System.out.println("Математика, чтение, английский язык");
                break;
            case 6:
                System.out.println("Суббота");
                System.out.println("Гимнастика");
                break;
            case 7:
                System.out.println("Воскресенье");
                System.out.println("Занятий нет, выходной");
                break;
            default:
                System.out.println("Такого дня недели не существует");
                break;
        }
    }
}
