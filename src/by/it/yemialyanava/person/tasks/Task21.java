package by.it.yemialyanava.person.tasks;

public class Task21 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100 +1);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(max < arr[j]){
                max = arr[j];
            } else if (min > arr[j]){
                min = arr[j];
            }
        }
        System.out.println("Максимальный элемент " + max + "\nMинимальный элемент " + min );
    }
}
