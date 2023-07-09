package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emails) {
        long result;

        result = emails.stream()
                .filter(email -> email.endsWith("yandex.ru"))
                .count();

        result += emails.stream()
                .filter(email2 -> email2.endsWith("gmail.com"))
                .count();

        result += emails.stream()
                .filter(email3 -> email3.endsWith("hotmail.com"))
                .count();

        return result;
    }

}
// END
