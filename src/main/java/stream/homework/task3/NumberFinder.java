package stream.homework.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class NumberFinder {

    public static void main(String[] args) {

        List<String> input = asList("1, 2, 0", "4, 5");

        String numbersLine = input.stream()
                .map(element -> (List<String>) new ArrayList<>(List.of(element
                        .replaceAll("\\D+", " ").split(" "))))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(numbersLine);
    }
}

