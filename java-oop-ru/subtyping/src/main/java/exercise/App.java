package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void main(String[] args) {
        Map<String, String> testMap = Map.of("key1", "value1", "key2", "value2");
        KeyValueStorage storage = new InMemoryKV(testMap);
        swapKeyValue(storage);
        System.out.println(storage.toMap());
    }

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = storage.toMap();
        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            storage.unset(entry.getKey());
            storage.set(entry.getValue(), entry.getKey());
        }
    }
}
// END
