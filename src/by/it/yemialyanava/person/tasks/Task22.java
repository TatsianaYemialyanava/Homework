package by.it.yemialyanava.person.tasks;

public class Task22 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100 +1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = arr.length - 1; j >= 0 ; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
