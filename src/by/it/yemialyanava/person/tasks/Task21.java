package by.it.yemialyanava.person.tasks;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100 +1);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        int max = arr[0];
        int min = arr[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int j = 0; j < arr.length; j++) {
            if(max < arr[j]){
                max = arr[j];
                indexOfMax = j;
            }
            if (min > arr[j]){
                min = arr[j];
                indexOfMin = j;
            }
        }
        System.out.println("Максимальный элемент " + max + "\nMинимальный элемент " + min );

        int[] sortedIndexes = new int[]{indexOfMin, indexOfMax};
        Arrays.sort(sortedIndexes);

        int summa = 0;
        for (int i = sortedIndexes[0] + 1; i < sortedIndexes[1];  i++) {
                summa = summa + arr[i];
        }
        System.out.println(summa);

    }
}
