package by.it.yemialyanava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ta {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Integer n = (int) (Math.random()*10) +1;
            numbers.add(n);
        }

        /*for (Integer e: numbers) {
            System.out.print(e + " ");
        }*/
        System.out.print(numbers.toString() + " ");
        System.out.println();

        Set<Integer> numbersSet = new HashSet<>(numbers);
        System.out.print(numbersSet.toString() + " ");
    }
}
