package by.it.yemialyanava.person.tasks;

import java.text.NumberFormat;

public class Task17 {
    /*public static void main(String[] args) {
        Integer number = 205896325;
        //Integer number = 500;
        char[] numberArray =number.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i =0; i < numberArray.length; i++) {
            if ((numberArray.length - i)% 3 == 0 && i != 0){
                result.append(' ');
            }
            result.append(numberArray[i]);
        }
        System.out.println(result.toString());
    }*/
   /* public static void main(String[] args) {
        int number = 205896325;
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.format(number));
    }*/

    public static void main ( String[] args ) {
        int x = 1123456789;
        makeGood( x );
    }

    private static void makeGood ( long x ) {
        if ( x == 0 ) return;
        makeGood( x / 1000 );
        System.out.print( x % 1000 + " " );
    }
}
