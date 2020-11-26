package by.it.yemialyanava.person.tasks;

public class Task10 {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 7.0;
        double c = 1.2;
        double d = 2;
        double e = 6.5;
        double f = 16.0;
        if (((a + c) <= e) && ((f >= b) && (f >= d))){
            System.out.println("Дома помещаются на участке");
        } else if (((b + d) <= f) && ((e >= a) && (e >= c))){
            System.out.println("Дома помещаются на участке");
        } else{
            System.out.println("Дома не помещаются на участке");
        }
    }
}
