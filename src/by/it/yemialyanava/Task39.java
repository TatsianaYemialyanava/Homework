package by.it.yemialyanava;

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public static void main(String[] args) {
        List <Integer> marks = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Integer n = (int) (Math.random()*10) +1;
            marks.add(n);

        }
        for (Integer e : marks) {
            System.out.print(e + " ");

        }
        /*for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + " ");
        }*/
        System.out.println();
        
        for (int j = 0; j < marks.size(); j++) {
            if (marks.get(j) < 4){
                marks.remove(j);
            }

        }
        for (int z = 0; z < marks.size(); z++) {
            System.out.print(marks.get(z) + " ");

        }
        
    }
}
