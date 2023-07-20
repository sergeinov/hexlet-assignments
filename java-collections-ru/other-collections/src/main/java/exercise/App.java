package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {

    public static LinkedHashMap<String, String> genDiff(
            Map<String, Object> data1,
            Map<String, Object> data2
    ) {
        var result = new LinkedHashMap<String, String>();

        var keys = new TreeSet<String>(); // для сортировки ключей по алфавиту
        keys.addAll(data1.keySet());
        keys.addAll(data2.keySet());
       
        for (var key : keys) {
            var value1 = data1.get(key);
            var value2 = data2.get(key);
            if (Objects.equals(value1, value2)) {
                result.put(key, "unchanged");
            } else if (value1 == null) {
                result.put(key, "added");
            } else if (value2 == null) {
                result.put(key, "deleted");
            } else {
                result.put(key, "changed");
            }
        }

        return result;
    }

}
//END
