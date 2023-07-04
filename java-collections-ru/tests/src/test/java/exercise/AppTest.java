package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        // Создаем список для тестирования
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        var count = 3;

        // Ожидаемый результат
        List<Integer> expected = Arrays.asList(1, 2, 3);

        // Вызываем тестируемый метод
        List<Integer> result = App.take(elements, count);

        // Проверяем, что результат соответствует ожидаемому значению
        assertThat(result).isEqualTo(expected);

        // END
    }
}
