package stream.homework.task4;

import java.util.stream.Collectors;

public class EndlessRandomTest {

    public static void main(String[] args) {

        EndlessRandom randomLine = new EndlessRandom(5L, 25214903917L, 11L, 2 ^ 48L);

        String randomValues = randomLine.generateRandom()
                .limit(10)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println("Random values: " + randomValues);
    }
}
