package by.it.yemialyanava.person.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        String str = "Java java Ox15D la-la-la Ox16A OxA53 Ox15D la-la-la Ox16A OxA53";
        Pattern pattern = Pattern.compile(("Ox[A-Za-z1-9]+"));
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            String start = matcher.group();
            count++;
        }
        System.out.println("Количество шестнадцатеричный чисел в строке равно " + count);
    }
}
