package by.it.yemialyanava.person.tasks;

public class Task15 {

    public static void main(String[] args) {
        int counter = 0;
        int i = 50;
        for ( ; i <= 70 ; i++) {
            boolean prostoe = isProstoe(i);
            if (prostoe){
                counter++;
                if (counter==2){
                    break;
                }
            }
        }
        if (counter == 2){
            System.out.println("Второе простое число от 50 до 70 равно " + i);
        } else {
            System.out.println("Второе простое число от 50 до 70 не найдено");
        }
    }

    private static boolean isProstoe(int i) {
        boolean isProstoe = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0){
                isProstoe = false;
                break;
            }
        }
        return isProstoe;
    }
}
