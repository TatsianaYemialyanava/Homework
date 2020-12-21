package by.it.yemialyanava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task41 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Integer n = (int) (Math.random()*10) +1;
            marks.add(n);
        }
        System.out.print(marks.toString() + " ");
        System.out.println();

        Iterator <Integer> iterator = marks.iterator();
        Integer max = marks.get(0);
        while (iterator.hasNext()){
            Integer myNextValue = iterator.next();
            if(myNextValue > max){
                max = myNextValue;
            }
        }
        System.out.println("Max value is " + max.toString());
    }

}
