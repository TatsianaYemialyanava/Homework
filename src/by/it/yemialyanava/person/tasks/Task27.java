package by.it.yemialyanava.person.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String text = " Я красивый, озорной гуляка, со всего лесного околотка, в переулке каждая собака, знает мою " +
                "четкую походку, каждая задрыпаная лошадь, головой - кивает мне на встречу    , " +
                "потому что я иду в голошах! ";
        String text1 =text.replaceAll(" +", " ").trim();
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(text1);
        int words = 0;
        while (matcher.find()){
            int start = matcher.start();
            words++;
        }
        System.out.println("Количество слов в тексте - " + words);
    }
}
