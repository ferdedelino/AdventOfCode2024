package org.day11;

import java.util.*;

public class Main {

    private static final int blinks = 75;
    private static final int cacheLimit = 10;
    private static Map<Long, Map<Integer, Long>> cache = new HashMap<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < cacheLimit; i++) {
            cache.put((long) i, new HashMap<>());
        }
        long[] input = {475449, 2599064, 213, 0, 2, 65, 5755, 51149};
        buildCache();
        long sum = Arrays.stream(input).map(stone -> evolveStoneAndCount(stone, blinks)).sum();
        long duration = System.currentTimeMillis() - start;

        System.out.println("Sum: " + sum);
        System.out.println("Duration: " + duration);
    }

    private static void buildCache() {
        for (int blink = 1; blink <= blinks; blink++) {
            for (int i = 0; i < cacheLimit; i++) {
                long i1 = evolveStoneAndCount(i, blink);
                cache.get((long)i).put(blink, i1);
            }
        }

    }

    private static long evolveStoneAndCount(long stone, int blinksLeft) {
        if (cache.containsKey(stone)) {
            long c = cache.get(stone).getOrDefault(blinksLeft, -1L);
            if (c != -1)
                return c;
        }
        if (blinksLeft == 0)
            return 1;
        if (stone == 0)
            return evolveStoneAndCount(1, blinksLeft - 1);
        long[] split = splitIfPossible(stone);
        if (split == null)
            return evolveStoneAndCount(stone * 2024, blinksLeft - 1);
        return evolveStoneAndCount(split[0], blinksLeft - 1) + evolveStoneAndCount(split[1], blinksLeft - 1);
    }

    private static long[] splitIfPossible(long stone) {
        int digits = 0;
        long x = stone;
        while (x > 0) {
            digits++;
            x = x / 10;
        }
        if (digits % 2 != 0)
            return null;
        long left = stone;
        long right = 0;
        long tenPot = 1;
        for (int i = 0; i < digits / 2; i++) {
            tenPot *= 10;
            left /= 10;
        }
        right = stone % tenPot;
        return new long[]{left, right};
    }
}