package hw11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Ann");
        list.add("Marina");
        list.add("Maks");
        list.add("Vova");
        list.add("Tanya");

        listReverser(list);
    }

    private static void listReverser(List<String> list) {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("The list is empty");
        }

        Stream<String> stream = list.stream()
                .sorted(Comparator.reverseOrder())
                .map(name ->  name.toUpperCase());


        System.out.println("stream.toList() = " + stream.collect(Collectors.toList()));
    }
}
