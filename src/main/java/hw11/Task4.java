package hw11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        streamRandomNumbersGenerator(25214903917L, 11L, 2 ^ 48L)
                .limit(20)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
    long x, a, c, m;

    public Task4(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public long randomNext() {
        x = (a * x + c) % m;
        return x;
    }

    private static Stream<Long> streamRandomNumbersGenerator(long a, long c, long m) {
        Task4 myRandom = new Task4(a, c, m);

        return Stream.iterate(myRandom.x, (x1) -> myRandom.randomNext());
    }

}
