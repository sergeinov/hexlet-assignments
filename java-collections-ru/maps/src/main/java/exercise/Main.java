package exercise;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // BEGIN
        String sentence = "java is the best programming language java";
        Map wordsCount = App.getWordCount(sentence);
        String result = App.toString(wordsCount);
        System.out.println(result);

        String sentence2 = "";
        Map wordsCount2 = App.getWordCount(sentence2);
        String result2 = App.toString(wordsCount2);
        System.out.println(result2);
        //END
    }
}
