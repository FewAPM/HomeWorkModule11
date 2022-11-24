package hw11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "2", "3");
        Stream<String> second = Stream.of("a", "b", "c", "d");

        zip(first, second).forEach(System.out::println);

    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> resultList = new ArrayList<>();

        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            resultList.add(firstIterator.next());
            resultList.add(secondIterator.next());
        }
        return resultList.stream();
    }
}
