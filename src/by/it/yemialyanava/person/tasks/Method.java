package by.it.yemialyanava.person.tasks;

public class Method {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        System.out.println(actionsWithNumbers(a, b));
    }
    static int actionsWithNumbers(int a, int b){
        int sum = a + b;
        int result = sum + a * b;
        return result;
    }
}
