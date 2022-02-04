package stream.homework.task1;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class OddObjects {

    public static void main(String[] args) {

        List<String> namesList = asList("1. Ivan", "2. Olesia", "3. Marina", "4. Volodymyr",
                "5. Dmytro", "6. Alina", "7. Masha", "8. Artem", "9. Sergij");

        String namesAtOddPosition = namesList
                .stream()
                .filter(OddObjects::findOddPosition)
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(namesAtOddPosition);
    }

    public static boolean findOddPosition(String element) {
        boolean result = false;
        String[] positionChecker = element.split(". ");
        if (Integer.parseInt(positionChecker[0]) % 2 != 0) {
            result = true;
        }
        return result;
    }
}
