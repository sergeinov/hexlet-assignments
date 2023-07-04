package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        boolean isMatch = true;

        for (Map<String, String> book : books) {
            for (Entry<String, String> entry : where.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                result.add(book);
            }
        }
        return result;
    }

}
//END
