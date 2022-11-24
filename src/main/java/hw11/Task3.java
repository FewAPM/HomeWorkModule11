package hw11;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Task3 {
    public static void main(String[] args) {


        String[] inputArray = {"1, 2, 0", "4, 5"};

        String temp = Arrays.toString(inputArray);

        temp = temp.replaceAll(" ", "");

        byte[] bytes = temp.getBytes(StandardCharsets.UTF_8);

        ArrayList<Integer> filteredAndSorted = new ArrayList<>();


        for (byte aByte : bytes) {
            if (Character.isDigit((char) aByte)) {
                filteredAndSorted.add((int) aByte);
            }
            Collections.sort(filteredAndSorted);


        }

        StringBuilder forPrint = new StringBuilder();
        forPrint.append("\"");

        char[] chars = new char[filteredAndSorted.size()];

        int[] numbers = new int[filteredAndSorted.size()];

        for (int i = 0; i < filteredAndSorted.size(); i++) {
            numbers[i] = filteredAndSorted.get(i);
            chars[i] = (char) numbers[i];
            if (i == filteredAndSorted.size() - 1) {
                forPrint.append(chars[i]).append("\"");
                break;
            }
            forPrint.append(chars[i]).append(", ");
        }

        System.out.println(forPrint);



    }
}
