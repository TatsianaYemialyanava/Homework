package by.it.yemialyanava.person.tasks;

public class Task18 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10 +1);
            //System.out.println(arr[i]);
        }
        System.out.println(arr[9]);
    }
}
