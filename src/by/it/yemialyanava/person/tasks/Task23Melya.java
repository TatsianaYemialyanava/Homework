package by.it.yemialyanava.person.tasks;

public class Task23Melya {

    public static void main(String[] args) {
        int arraySide  = 9;
        Integer[][] array = new Integer[arraySide][arraySide];
        populateArray(array);
        printArray(array);
    }

    public static void populateArray(Integer[][] array){
        int rowIndex = 0;
        int maxDistance = array.length/2 *(-1);
        while(rowIndex < array.length) {
            for (int columntIndex = 0; columntIndex < array.length; columntIndex++) {
                int diffFromMiddle = Math.abs(columntIndex - array.length/2);
                if (diffFromMiddle <= Math.abs(maxDistance)){
                    array[rowIndex][columntIndex]=1;
                } else {
                    array[rowIndex][columntIndex]=0;
                }
            }
            maxDistance++;
            rowIndex++;
        }
    }

    public static void printArray(Integer[][] array) {
        for (int i=0; i < array.length; i++){
            Integer[] row = array[i];
            for (int j = 0; j < row.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
