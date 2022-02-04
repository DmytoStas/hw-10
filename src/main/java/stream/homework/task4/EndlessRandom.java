package stream.homework.task4;

import java.util.stream.Stream;

public class EndlessRandom {

    private long seed, a, c, m;

    public EndlessRandom(long seed, long a, long c, long m) {
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Stream<Long> generateRandom() {
        return Stream.iterate(seed, seed -> (a * seed + c) % m);
    }
}
