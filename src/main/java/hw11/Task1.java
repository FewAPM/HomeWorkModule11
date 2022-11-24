package hw11;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Ann");
        list.add("Marina");
        list.add("Maks");
        list.add("Vova");
        list.add("Tanya");

         oddNamesPrinter(list);

    }

    private static void oddNamesPrinter(List<String> list) {
        if (list.size() == 0) {
            throw new IndexOutOfBoundsException("The list is empty");
        }
        String names = "";

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                 names += i + ". " + list.get(i) + ", ";
            }
        }

        names = names.trim();
        if (names.charAt(names.length()-1) == ',') {
            names = names.substring(0, names.length()-1);
        }

        System.out.println(names);

    }

}

