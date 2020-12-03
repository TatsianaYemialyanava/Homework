package by.it.yemialyanava.person.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        String text = "Я обонял, я зрел, я глазом двигал и блок : тройничный отводил. лицом и ! ухом . языкоглоткой. " +
                "блуждая шел добавочной походкой - под языком все нервы надодил?";
        Pattern pattern = Pattern.compile("[-?!,:.;()]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            int start = matcher.start();
            count++;
        }
        System.out.println("Количесво знаков препинания в прпедложении = " + count);
    }
}
