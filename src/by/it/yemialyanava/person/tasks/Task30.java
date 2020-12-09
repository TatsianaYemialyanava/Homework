package by.it.yemialyanava.person.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        String str = "<p> kkk <p id=\"p1\"> lll <p> kkk <p id=\"p1\"> hhh " +
                "<p id=\"p1\"> eee <p> kkk <p id=\"p1\"> hhh <p id=\"p1\">";
        String stringNew = str.replaceAll("<p id=\"p1\">", "<p>");

        Pattern pattern = Pattern.compile("<p>");
        Matcher matcher = pattern.matcher(stringNew);
        int count = 0;
        while (matcher.find()){
           String start = matcher.group();
            count++;
        }
        System.out.println(stringNew);
        System.out.println("Тег абзаца встречается в тексте " + count + " раз.");
    }
}
