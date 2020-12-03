package by.it.yemialyanava.person.tasks;

public class Task23 {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == 4){
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            if (i==1 || i == 3){
                arr[i][0] = 0;
                System.out.print(arr[i][0]+ " ");
                for (int j = 1; j < arr[i].length - 1; j++) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]+ " ");
                }
                arr[i][4] = 0;
                System.out.print(arr[i][4]+ " ");
                System.out.println();
            }

            if (i == 2){
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == 2){
                        arr[i][j] = 1;
                        System.out.print(arr[i][j]+ " ");
                    } else {
                        arr[i][j] = 0;
                        System.out.print(arr[i][j]+ " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
