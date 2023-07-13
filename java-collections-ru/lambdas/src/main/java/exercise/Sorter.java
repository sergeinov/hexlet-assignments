package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday"))))
                .filter(user -> user.get("gender").equals("male"))
                .map(user-> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
