package stream.homework.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamZipper {
    public static void main(String[] args) {

        Stream<String> first =
                Stream.of("1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.", "9.", "10.", "11.");

        Stream<String> second =
                Stream.of("Ivan", "Olesia", "Marina", "Volodymyr", "Dmytro", "Alina", "Masha", "Artem", "Sergij");

        Stream<String> result = zipIterators(first, second);

        String line = result.collect(Collectors.joining(", ", "Zip line created - ", "."));

        System.out.println(line);

    }

    public static <T> Stream<String> zipIterators(Stream<T> first, Stream<T> second) {
        List<String> resultList = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            String pasteTogether = iteratorFirst.next() + " " + iteratorSecond.next().toString();
            resultList.add(pasteTogether);
        }

        return resultList.stream();
    }
}
