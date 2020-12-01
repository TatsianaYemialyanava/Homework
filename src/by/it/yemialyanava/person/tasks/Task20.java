package by.it.yemialyanava.person.tasks;

public class Task20 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.println(array[i]);
        }
        System.out.println();
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]){
                max = array[j];
            }

        }
        System.out.println("Максимальный элемент " + max);
    }
}
