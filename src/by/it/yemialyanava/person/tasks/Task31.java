package by.it.yemialyanava.person.tasks;

public class Task31 {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        long start1 = System.nanoTime();
        String slowSteing = slow(str);
        long finish1 = System.nanoTime();
        long timeElapsedString = finish1 - start1;
        System.out.println("Время работы цикла " + timeElapsedString + " наносекунд");

        long start2 = System.nanoTime();
        String fastString = fast(str);
        long finish2 = System.nanoTime();
        long timeElapsedSB = finish2 - start2;
        System.out.println("Время работы цикла " + timeElapsedSB + " наносекунд");

        printResult(timeElapsedString, timeElapsedSB);
    }

    static String slow(String text){
        String result = "";
        for (int i = 0; i <= 1000; i++) {
            result += text;
        }
        return result;
    }

    static String fast (String text){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 1000; i++) {
            stringBuilder.append(text);
        }
        return stringBuilder.toString();
    }

    static void printResult(long str, long sb){
        if (str > sb){
            System.out.println("StringBuilder работает быстрее");
        } else {
            System.out.println("String  работает быстрее");
        }
    }
}
