package by.it.yemialyanava.person.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        String firstText = "Я красивый, озорной гуляка, со всего лесного околотка, в переулке каждая собака, знает мою " +
                "четкую походку, каждая задрыпаная лошадь, головой - кивает мне на встречу  " +
                "потому что я иду в голошах!";
        String firstText2 = firstText.replaceAll(" +", " ").trim();
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(firstText2);
        while (matcher.find()){
            String slovo = matcher.group();
            char znak = slovo.charAt(slovo.length()-1);
            stringBuilder.append(znak);
        }
        System.out.println(stringBuilder.toString());
    }
}
