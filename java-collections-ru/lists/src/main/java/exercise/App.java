package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {

    public static boolean scrabble(String letters, String word) {
        List<String> lettersList = new ArrayList<>();
        lettersList.addAll(Arrays.asList(letters.split("")));

        List<String> wordList = new ArrayList<>();
        wordList.addAll(Arrays.asList(word.split("")));

        for (String letter : wordList) {
            letter = letter.toLowerCase();
            if (!lettersList.contains(letter)) {
                return false;
            }
            lettersList.remove(letter);
        }
        return true;
    }
}
//END
