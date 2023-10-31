package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
public class App {
    public static void save(Path filePath, Car car) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Сериализация объекта Car в JSON и сохранение в файл
            String json = objectMapper.writeValueAsString(car);
            Files.writeString(filePath, json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car extract(Path filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Чтение JSON из файла и десериализация в объект Car
            String json = Files.readString(filePath);
            return objectMapper.readValue(json, Car.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
// END
