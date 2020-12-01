package by.it.yemialyanava.person.tasks;

public class Task19 {
    public static void main(String[] args) {
        /*int a = 10;
        int [] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100 +1);
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }*/
        int a = 10;
        int [] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100 +1);
            if(i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
