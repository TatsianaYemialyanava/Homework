package by.it.yemialyanava;

import java.util.HashMap;
import java.util.Map;

public class WordsMap {
    public static void main(String[] args) {
        String text = "When I find myself in times of trouble mother Mary comes to me speaking words of wisdom, let " +
                "it be and in my hour of darkness she is standing right in front of me speaking words of wisdom, let" +
                "it be let it be, let it be let it be, let it be whisper words of wisdom, let it be and when " +
                "the broken-hearted people living in the world agree there will be an answer, let it be for though " +
                "they may be parted there is still a chance that they will see there will be an answer, let it be" +
                "let it be, let it be let it be, let it be yeah, there will be an answer, let it be let it be, " +
                "let it be let it be, let it be whisper words of wisdom, let it be let it be, let it be let it be," +
                "yeah, let it be whisper words of wisdom, let it be and when the night is cloudy there is still a" +
                "light…";
        String textNew = text.replace(",","");
        Map<String, Integer> mapWords = new HashMap<>();

        String[] words = textNew.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (mapWords.get(words[i]) == null) {
                mapWords.put(words[i], 1);
            } else {
                Integer valueWords = mapWords.get(words[i]) + 1;
                mapWords.put(words[i], valueWords);
            }
        }

        for (Map.Entry<String, Integer> entry: mapWords.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
