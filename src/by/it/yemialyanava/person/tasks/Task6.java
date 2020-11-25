package by.it.yemialyanava.person.tasks;

public class Task6 {
    public static void main(String[] args) {
     int i = 67;
     sevenTrue(i);
    }

    static void sevenTrue(int a){
        if ((a % 10) == 7) {
            System.out.println("Последняя цифра является семеркой");
        }
        else {
            System.out.println("Последняя цифра не является семеркой");
        }
    }
}
