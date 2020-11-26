package by.it.yemialyanava.person.tasks;

public class Task12 {
    public static void main(String[] args) {
        int x = 0;
        int factorial = 1;
        while (x <= 10){
            if (x == 0){
                x++;
                continue;
            }
            factorial = factorial * x;
            x++;
        }
        System.out.println("Факториал целых чисел от 0 до 10 равен " + factorial);
    }
}
