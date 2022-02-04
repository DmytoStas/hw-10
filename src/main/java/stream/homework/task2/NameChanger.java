package stream.homework.task2;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NameChanger {

    public static void main(String[] args) {

        List<String> namesList = List.of("1. Ivan", "2. Olesia", "3. Marina", "4. Volodymyr",
                "5. Dmytro", "6. Alina", "7. Masha", "8. Artem", "9. Sergij");

        AtomicInteger orderCount = new AtomicInteger(1);

        String orderedAndEditedNames = namesList
                .stream()
                .map(element -> element.substring(3).toUpperCase(Locale.ROOT))
                .sorted(String::compareTo)
                .map(editedName -> orderCount.getAndIncrement() + ". " + editedName)
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(orderedAndEditedNames);

    }
}
