package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String str) {
        int count;
        Map<String, Integer> map = new HashMap<>();

        if (str.equals("")) {
            return map;
        }

        String[] words = str.split(" ");
        for (String word : words) {
            // getOrDefault(Object key, V defaultValue)
            // Возвращает значение, с которым сопоставлен указанный ключ,
            // или defaultValue, если эта мапа не содержит значения для ключа.
            count = map.getOrDefault(word, 0);
            map.put(word, count + 1);
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        var keys = map.keySet();             // получить набор ключей
        var result = new StringBuilder();   // создать объект StringBuilder

        if (map.isEmpty()) {
            return "{}";
        }

        result.append("{\n");
        for (var key : keys) {
            result.append("  ");
            result.append(key);
            result.append(": ");
            result.append(map.get(key));
            result.append("\n");
        }
        result.append("}");

        return result.toString();
    }

}
//END
